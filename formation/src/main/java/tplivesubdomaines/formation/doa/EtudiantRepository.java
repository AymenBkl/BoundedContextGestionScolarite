package tplivesubdomaines.formation.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tplivesubdomaines.formation.models.Etudiant;

import java.util.List;

@RepositoryRestResource
public interface EtudiantRepository  extends JpaRepository<Etudiant,Long> {
    List<Etudiant> findEtudiantsByIdFormation(Long id);
}
