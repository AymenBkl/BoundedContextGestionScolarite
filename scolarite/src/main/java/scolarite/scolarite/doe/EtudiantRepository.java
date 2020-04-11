package scolarite.scolarite.doe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import scolarite.scolarite.Entities.Etudiant;

@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
