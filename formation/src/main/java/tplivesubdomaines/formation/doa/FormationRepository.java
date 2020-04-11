package tplivesubdomaines.formation.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tplivesubdomaines.formation.Entities.Formation;
@RepositoryRestResource
public interface FormationRepository extends JpaRepository<Formation,Long> {
}
