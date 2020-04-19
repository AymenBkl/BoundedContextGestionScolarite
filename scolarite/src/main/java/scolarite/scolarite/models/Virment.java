package scolarite.scolarite.models;

import lombok.Data;

import java.util.Date;

@Data
public class Virment {
    private Long idVirement;
    private Date dateVirement;
    private String CCP;
}
