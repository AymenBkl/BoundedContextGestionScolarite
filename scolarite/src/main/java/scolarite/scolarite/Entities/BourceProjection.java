package scolarite.scolarite.Entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import sun.awt.SunHints;

import java.util.Date;

@Projection(name ="etudiantbource",types = Etudiant.class)
public interface BourceProjection {
    @Value("#{target.nom}")
    public String getNomEtudiant();
    @Value("#{target.promo}")
    public String getPromoEtudiant();
    @Value("#{target.dateInscription}")
    public Date getdateInscription();
    @Value("#{target.etablissement.nom}")
    public String getNomEtablisement();
}
