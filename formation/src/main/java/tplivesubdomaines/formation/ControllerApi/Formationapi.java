package tplivesubdomaines.formation.ControllerApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tplivesubdomaines.formation.Entities.Formation;
import tplivesubdomaines.formation.doa.FormationRepository;
import tplivesubdomaines.formation.models.Etudiant;
import tplivesubdomaines.formation.proxy.Scolarite;

import java.text.Normalizer;
import java.util.List;

@RestController
@RequestMapping("api")
public class Formationapi {

    @Autowired
    FormationRepository formationrepo;
    @Autowired
    Scolarite scolariteproxy;

    @GetMapping("/formations/{id}")
    public Formation getFormationByid(@PathVariable("id") Long idf){
        Formation formation = formationrepo.findById(idf).get();
        formation.setLesetudiant(scolariteproxy.getEtudiant(idf,"ftoe"));
        return formation;
    }
    @GetMapping("/formations")
    public List<Formation> getFormation(){
        List<Formation> formations = formationrepo.findAll();
        for (Formation formation : formations){
            Long idFormation = formation.getIdFormation();
            formation.setLesetudiant(scolariteproxy.getEtudiant(idFormation,"ftoe"));
        }
        return formations;
    }

}
