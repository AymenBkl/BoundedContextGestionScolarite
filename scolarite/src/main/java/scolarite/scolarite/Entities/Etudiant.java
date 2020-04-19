package scolarite.scolarite.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import scolarite.scolarite.models.Formation;
import scolarite.scolarite.models.Virment;

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
    private Formation formation;
    @Transient
    private CollectionModel<Virment> virments;
}
