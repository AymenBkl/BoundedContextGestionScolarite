package tplivesubdomaines.bource.apiController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tplivesubdomaines.bource.Entities.Etudiant;
import tplivesubdomaines.bource.Entities.Virement;
import tplivesubdomaines.bource.ScolariteProxy;
import tplivesubdomaines.bource.doe.EtudiantRepository;
import tplivesubdomaines.bource.doe.VirementRepository;
import tplivesubdomaines.bource.models.Etablisment;

@RestController
@RequestMapping("api")
public class BourceController {
    @Autowired
    EtudiantRepository etudiantrepo;
    @Autowired
    VirementRepository virmentrepo;
    @Autowired
    ScolariteProxy scolariteproxy;
    @GetMapping("/etudiants/1")
    public Etudiant getEtudiant(@PathVariable("id") Long ide){
        Etudiant e = etudiantrepo.findById(ide).get();
        tplivesubdomaines.bource.models.Etudiant e1 = scolariteproxy.getEtudiant(ide);
        Etablisment et = scolariteproxy.getEtablisment(e1.getEtablissement().getIdEtablissement());
        e.setDateinsciption(e1.getDateInscription());
        e.setNom(e1.getNom());
        e.setPromo(e1.getPromo());
        e.setNomEtablissment(et.getNom());
        return e;
    }
}
