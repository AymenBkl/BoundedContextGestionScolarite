package scolarite.scolarite.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import java.util.Date;

@Data
public class EtudiantVirement {
    private Long idetudiant;
    private Long CCP;
    private Float SalaireParent;
    private boolean SituationImp;
    private Virement virement;
}
