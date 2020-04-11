package tplivesubdomaines.scolarit.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tplivesubdomaines.scolarit.Entities.Etudiant;

@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
