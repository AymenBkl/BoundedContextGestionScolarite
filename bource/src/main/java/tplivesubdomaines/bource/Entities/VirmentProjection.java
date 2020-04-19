package tplivesubdomaines.bource.Entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "virmentprojection",types = Virement.class)
public interface VirmentProjection {
    @Value("#{target.idvirement}")
    public Long getIdVirement();
    @Value("#{target.datevirement}")
    public Date getDateVirement();
    @Value("#{target.etudiant.CCP}")
    public String getCCP();
}
