package tplivesubdomaines.bource.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class Etudiant {
    private Long idEtudiant;

    private String nom;
    private Date dateN;
    private String promo;
    private Date dateInscription;
    private Etablisment etablissement;
    private Long idFormation;
}
