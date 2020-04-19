package tplivesubdomaines.bource;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tplivesubdomaines.bource.models.Etudiant;

import javax.websocket.server.PathParam;

@FeignClient(name = "ms-scolarite",url = "localhost:8081")
public interface ScolariteProxy {
    @GetMapping("etudiants/search/findEtudiantByIdEtudiant")
    Etudiant getEtudiant(@RequestParam("ide") Long ide,
                                @RequestParam("projection") String nom);
}
