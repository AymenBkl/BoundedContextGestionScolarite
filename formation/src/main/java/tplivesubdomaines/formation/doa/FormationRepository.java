package tplivesubdomaines.formation.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tplivesubdomaines.formation.Entities.Formation;
@RepositoryRestResource
public interface FormationRepository extends JpaRepository<Formation,Long> {
    @GetMapping("/formations/{id}")
    Formation findByIdFormation(@PathVariable("id") Long id);
}
