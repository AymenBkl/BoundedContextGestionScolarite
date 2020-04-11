package scolarite.scolarite.ControllerApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import scolarite.scolarite.Entities.Etudiant;
import scolarite.scolarite.doe.EtudiantRepository;
import scolarite.scolarite.models.EtudiantVirement;
import scolarite.scolarite.models.Formation;
import scolarite.scolarite.models.Virement;
import scolarite.scolarite.proxy.Formationproxy;
import scolarite.scolarite.proxy.VirementProy;

@RestController
@RequestMapping("api")
public class ScolariteApi {
    @Autowired
    EtudiantRepository etudiantrepo;
    @Autowired
    Formationproxy formationproxy;
    @Autowired
    VirementProy virementproxy;
    @GetMapping("etudiant/{id}")
    public Etudiant getEtudiantById(@PathVariable("id") Long idf){
        Etudiant etudiant = etudiantrepo.findById(idf).get();
        Formation formation = formationproxy.getFormation(etudiant.getIdFormation());
        EtudiantVirement ev = virementproxy.getEtudiantV(idf);
        Virement virement = virementproxy.getVirement(ev.getVirement().getIdVirement());
        etudiant.setFormation(formation);
        etudiant.setIdVirement(virement.getIdVirement());
        etudiant.setCCP(ev.getCCP());
        etudiant.setDatevirement(virement.getDatevirement());
        return etudiant;
    }
}
