package tplivesubdomaines.bource.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Virement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idvirement;
    private Long montatns;
    @Temporal(TemporalType.DATE)
    private Date datevirement;
    @ManyToOne
    private Etudiant etudiant;
}
