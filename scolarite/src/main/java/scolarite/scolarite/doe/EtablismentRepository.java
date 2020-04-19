package scolarite.scolarite.doe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import scolarite.scolarite.Entities.Etablisment;
@RepositoryRestResource
public interface EtablismentRepository extends JpaRepository<Etablisment,Long> {

}
