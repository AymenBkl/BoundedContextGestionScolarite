package scolarite.scolarite.doe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import scolarite.scolarite.Entities.Etudiant;

import java.util.List;

@RepositoryRestResource

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    List<Etudiant> findEtudiantByIdFormation(Long idf);
    Etudiant findEtudiantByIdEtudiant(Long ide);
}
