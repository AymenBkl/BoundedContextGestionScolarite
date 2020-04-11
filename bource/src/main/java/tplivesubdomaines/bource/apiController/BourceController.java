package tplivesubdomaines.bource.apiController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tplivesubdomaines.bource.Entities.Etudiant;
import tplivesubdomaines.bource.Entities.Virement;
import tplivesubdomaines.bource.doe.EtudiantRepository;
import tplivesubdomaines.bource.doe.VirementRepository;

@RestController
@RequestMapping("api")
public class BourceController {
    @Autowired
    EtudiantRepository etudiantrepo;
    @Autowired
    VirementRepository virmentrepo;
    @GetMapping("/etudiants/1")
    public Etudiant getEtudiant(@PathVariable("id") Long ide){
        Etudiant e = etudiantrepo.findById(ide).get();
        Virement v = virmentrepo.findById(e.getVirement().getIdvirement()).get();
        e.setVirement(v);
        return e;
    }
}
