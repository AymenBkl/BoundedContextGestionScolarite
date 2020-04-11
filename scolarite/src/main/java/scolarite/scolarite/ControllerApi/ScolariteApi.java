package scolarite.scolarite.ControllerApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import scolarite.scolarite.Entities.Etudiant;
import scolarite.scolarite.doe.EtudiantRepository;
import scolarite.scolarite.models.Formation;
import scolarite.scolarite.proxy.Formationproxy;

@RestController
@RequestMapping("api")
public class ScolariteApi {
    @Autowired
    EtudiantRepository etudiantrepo;
    @Autowired
    Formationproxy formationproxy;
    @GetMapping("etudiant/{id}")
    public Etudiant getEtudiantById(@PathVariable("id") Long idf){
        Etudiant etudiant = etudiantrepo.findById(idf).get();
        Formation formation = formationproxy.getFormation(etudiant.getIdFormation());
        etudiant.setFormation(formation);
        return etudiant;
    }
}
