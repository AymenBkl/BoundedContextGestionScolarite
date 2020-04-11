package tplivesubdomaines.scolarit.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Etablisment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtablissement;
    private String nom;

    @JsonIgnore
    @OneToMany(mappedBy = "etablissement")
    private Collection<Etudiant> etudiants;
}
