package tplivesubdomaines.bource.models;

import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.OneToMany;
import java.util.Collection;

@Data
public class Etablisment {
    private Long idEtablissement;
    private String nom;
    private Collection<Etudiant> etudiants;

}
