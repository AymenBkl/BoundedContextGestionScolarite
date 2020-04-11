package tplivesubdomaines.scolarit;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tplivesubdomaines.scolarit.model.Formation;

@FeignClient(name="ms-formation",url="localhost:8081")
public interface Formationproxy {
    @GetMapping("/formations/{id}")
    public Formation getFormation(@PathVariable("id") Long Idf);

}
