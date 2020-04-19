package scolarite.scolarite.Entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "ftoe",types = Etudiant.class)
public interface FormationProjection {
    @Value("#{target.nom}")
    public String getNomEtudiant();
    @Value("#{target.etablissement.nom}")
    public String getNomEtablisement();
}
