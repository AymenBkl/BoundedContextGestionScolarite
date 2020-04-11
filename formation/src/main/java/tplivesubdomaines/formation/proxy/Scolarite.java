package tplivesubdomaines.formation.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tplivesubdomaines.formation.models.Etablissment;
import tplivesubdomaines.formation.models.Etudiant;

@FeignClient(name = "ms-scolarite",url = "localhost:8081")
public interface Scolarite {
    @GetMapping("/etablisments/{id}")
    public Etablissment getEtablissment(@PathVariable("id") Long idet);
}
