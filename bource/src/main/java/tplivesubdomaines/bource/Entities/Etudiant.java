package tplivesubdomaines.bource.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Etudiant {
    @Id
    private Long idetudiant;
    private Long CCP;
    private Float SalaireParent;
    private boolean SituationImp;
    @OneToMany(mappedBy = "etudiant")
    private List<Virement> virements;
    @Transient
    private tplivesubdomaines.bource.models.Etudiant etudiantscalaire;

}
