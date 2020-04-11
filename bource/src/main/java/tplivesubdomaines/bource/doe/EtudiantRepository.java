package tplivesubdomaines.bource.doe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;
import tplivesubdomaines.bource.Entities.Etudiant;
@RepositoryRestResource
public interface EtudiantRepository  extends JpaRepository<Etudiant,Long> {
}
