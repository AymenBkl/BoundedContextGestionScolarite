package scolarite.scolarite.ControllerApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import scolarite.scolarite.Entities.Etudiant;
import scolarite.scolarite.doe.EtudiantRepository;
import scolarite.scolarite.proxy.Formationproxy;
import scolarite.scolarite.proxy.VirementProxy;

import java.util.List;

@RestController
@RequestMapping("api")
public class ScolariteApi {
    @Autowired
    EtudiantRepository etudiantrepo;
    @Autowired
    Formationproxy formationproxy;
    @Autowired
    VirementProxy virmentproxy;
    @GetMapping("/etudiants/{id}")
    public Etudiant getEtudiantById(@PathVariable("id") Long idf){
        Etudiant etudiant = etudiantrepo.findById(idf).get();
        Long idEtudiant = etudiant.getIdEtudiant();
        etudiant.setFormation(formationproxy.getFormation(idEtudiant));
        etudiant.setVirments(virmentproxy.getVirment(idEtudiant,"virmentprojection"));
        return etudiant;
    }
    @GetMapping("/etudiants")
    public List<Etudiant> getAllEtudiant(){
        List<Etudiant> etudiants = etudiantrepo.findAll();
        for (Etudiant etudiant : etudiants){
            Long idEtudiant = etudiant.getIdEtudiant();
            etudiant.setFormation(formationproxy.getFormation(idEtudiant));
            etudiant.setVirments(virmentproxy.getVirment(idEtudiant,"virmentprojection"));
        }
        return etudiants;
    }
}
