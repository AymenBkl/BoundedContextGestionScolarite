package tplivesubdomaines.formation.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import tplivesubdomaines.formation.models.Etudiant;

import java.util.List;

@FeignClient(name = "ms-scolarite",url = "localhost:8081")
public interface Scolarite {
    @GetMapping("etudiants/search/findEtudiantByIdFormation")
    public CollectionModel<Etudiant> getEtudiant(@RequestParam("idf") Long idf,
                                       @RequestParam("projection") String nom);
}
