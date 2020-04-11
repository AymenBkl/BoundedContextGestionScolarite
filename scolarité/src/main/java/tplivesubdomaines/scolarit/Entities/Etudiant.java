package tplivesubdomaines.scolarit.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tplivesubdomaines.scolarit.model.Formation;

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
}
