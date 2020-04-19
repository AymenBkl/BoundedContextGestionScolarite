package tplivesubdomaines.bource.models;

import lombok.Data;

import java.util.Date;

@Data
public class Etudiant {
    private String nomEtudiant;
    private String promoEtudiant;
    private Date dateInscription;
    private String nomEtablisement;
}
