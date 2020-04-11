package scolarite.scolarite.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

@Data
public class Virement {
    private Long idvirement;
    private Long montatns;
    private Date datevirement;
    private List<EtudiantVirement> etudiants;

}
