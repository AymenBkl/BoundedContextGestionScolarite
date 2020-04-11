package tplivesubdomaines.bource;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tplivesubdomaines.bource.models.Etablisment;
import tplivesubdomaines.bource.models.Etudiant;

@FeignClient(name = "ms-scolarite",url = "localhost:8081")
public interface ScolariteProxy {
    @GetMapping("/etudiants/{id}")
    public Etudiant getEtudiant(@PathVariable("id") Long ide);
    @GetMapping("/etablisment/{id}")
    public Etablisment getEtablisment(@PathVariable("id") Long ide);

}
