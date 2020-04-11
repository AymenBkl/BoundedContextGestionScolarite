package tplivesubdomaines.bource.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idetudiant;
    @Column(name = "CCP",nullable = false)
    private Long CCP;
    @Column(name = "SalaireParent",nullable = true)
    private Float SalaireParent;
    @Column(name = "SituationImpo",nullable = false)
    private boolean SituationImp;
    @ManyToOne
    private Virement virement;

}
