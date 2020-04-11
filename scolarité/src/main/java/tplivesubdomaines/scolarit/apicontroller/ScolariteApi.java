package tplivesubdomaines.scolarit.apicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tplivesubdomaines.scolarit.Entities.Etudiant;
import tplivesubdomaines.scolarit.Formationproxy;
import tplivesubdomaines.scolarit.doa.EtudiantRepository;
import tplivesubdomaines.scolarit.model.Formation;

@RestController
@RequestMapping("api")
public class ScolariteApi {
    @Autowired
    EtudiantRepository eturepo;
    @Autowired
    Formationproxy formationsproxy;

    @GetMapping("etudiant/{id}")
    public Etudiant getEtudiant(@PathVariable("id") Long idf){
        Etudiant etudiant = eturepo.findById(idf).get();
        Formation formation = formationsproxy.getFormation(etudiant.getIdFormation());
        etudiant.setFormation(formation);
        return  etudiant;
    };


}
