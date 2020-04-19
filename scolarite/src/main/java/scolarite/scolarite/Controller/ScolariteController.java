package scolarite.scolarite.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import scolarite.scolarite.Entities.Etablisment;
import scolarite.scolarite.Entities.Etudiant;
import scolarite.scolarite.doe.EtablismentRepository;
import scolarite.scolarite.doe.EtudiantRepository;

import java.util.List;

@RestController
public class ScolariteController {
    @Autowired
    EtudiantRepository etudiantrepo;
    @Autowired
    EtablismentRepository etablismentrepo;
    @GetMapping("/etudiants")
    public List<Etudiant> getEtudiants(){
        List<Etudiant> etudiants = etudiantrepo.findAll();
        for (Etudiant etudiant : etudiants){
            Long idEtablisment = etudiant.getEtablissement().getIdEtablissement();
            etudiant.setEtablissement(etablismentrepo.findById(idEtablisment).get());
        }
        return etudiants;
    }
}
