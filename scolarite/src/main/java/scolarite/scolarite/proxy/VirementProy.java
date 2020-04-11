package scolarite.scolarite.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import scolarite.scolarite.models.EtudiantVirement;
import scolarite.scolarite.models.Virement;

@FeignClient(name = "ms-bource",url = "localhost:8083")
public interface VirementProy {
    @GetMapping("/virements/{id}")
    public Virement getVirement(@PathVariable("id") Long idv);
    @GetMapping("/etudiants/{id}")
    public EtudiantVirement getEtudiantV(@PathVariable("id") Long ide);
}
