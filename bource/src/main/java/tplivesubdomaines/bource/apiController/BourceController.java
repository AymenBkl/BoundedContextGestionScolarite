package tplivesubdomaines.bource.apiController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tplivesubdomaines.bource.Entities.Etudiant;
import tplivesubdomaines.bource.ScolariteProxy;
import tplivesubdomaines.bource.doe.EtudiantRepository;
import tplivesubdomaines.bource.doe.VirementRepository;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("api")
public class BourceController {
    @Autowired
    EtudiantRepository etudiantrepo;
    @Autowired
    VirementRepository virmentrepo;
    @Autowired
    ScolariteProxy scolariteproxy;
    @GetMapping("/etudiants/{id}")
    public Etudiant getEtudiant(@PathVariable("id") Long ide){
        Etudiant etudiant = etudiantrepo.findById(ide).get();
        etudiant.setEtudiantscalaire(scolariteproxy.getEtudiant(ide,"etudiantbource"));
        return etudiant;
    }
}
