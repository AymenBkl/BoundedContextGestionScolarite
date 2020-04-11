package tplivesubdomaines.formation.ControllerApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tplivesubdomaines.formation.Entities.Formation;
import tplivesubdomaines.formation.doa.EtudiantRepository;
import tplivesubdomaines.formation.doa.FormationRepository;
import tplivesubdomaines.formation.models.Etablissment;
import tplivesubdomaines.formation.models.Etudiant;
import tplivesubdomaines.formation.proxy.Scolarite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("api")
public class Formationapi {
    @Autowired
    FormationRepository formationrepo;
    @Autowired
    Scolarite scolarite;
    @Autowired
    EtudiantRepository etudiantrepo;
    @GetMapping("/formations/{id}")
    public Formation getFormationById(@PathVariable("id") Long idf){

        Formation formation = formationrepo.findById(idf).get();
        List<Etudiant> etudiant = etudiantrepo.findEtudiantsByIdFormation(idf);
        HashMap<String,String> etudiants = new HashMap<>();
        for (Etudiant e : etudiant){
            String s = scolarite.getEtablissment(e.getEtablissement().getIdEtablissment()).getNom();
            String s1 = e.getNom();
            etudiants.put(s,s1);
        }
        formation.setStudents(etudiants);
        return formation;
    }

}
