package tplivesubdomaines.bource.doe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.PathVariable;
import tplivesubdomaines.bource.Entities.Etudiant;
import tplivesubdomaines.bource.Entities.Virement;

import java.util.List;

@RepositoryRestResource
public interface VirementRepository extends JpaRepository<Virement,Long> {
    List<Virement> findVirementsByEtudiant_Idetudiant(Long ide);
}
