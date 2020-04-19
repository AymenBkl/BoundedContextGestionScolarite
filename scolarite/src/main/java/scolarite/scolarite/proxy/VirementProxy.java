package scolarite.scolarite.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import scolarite.scolarite.models.Virment;

@FeignClient(name = "ms-bource",url = "localhost:8083")
public interface VirementProxy {
    @GetMapping("/virements/search/findVirementsByEtudiant_Idetudiant")
    CollectionModel<Virment> getVirment(@RequestParam("ide") Long ide,
                                        @RequestParam("projection") String nom);
}
