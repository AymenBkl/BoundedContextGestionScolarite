package scolarite.scolarite.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import scolarite.scolarite.models.EtudiantVirement;
import scolarite.scolarite.models.Formation;
import scolarite.scolarite.models.Virement;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dateN;
    private String promo;
    @Temporal(TemporalType.DATE)
    private Date dateInscription;

    @ManyToOne
    private Etablisment etablissement;

    private Long idFormation;

    @Transient
    Formation formation;
    @Transient
    private Long idVirement;
    @Transient
    private Long CCP;
    @Transient
    private Date datevirement;
}
