package tplivesubdomaines.bource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tplivesubdomaines.bource.Entities.Etudiant;
import tplivesubdomaines.bource.Entities.Virement;
import tplivesubdomaines.bource.doe.EtudiantRepository;
import tplivesubdomaines.bource.doe.VirementRepository;

import java.sql.Date;

@SpringBootApplication
@EnableFeignClients
public class BourceApplication implements CommandLineRunner {
    @Autowired
    EtudiantRepository etudiantrepo;
    @Autowired
    VirementRepository virementrepo;
    public static void main(String[] args) {
        SpringApplication.run(BourceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Virement v1 = virementrepo.save(new Virement(null, 400L, Date.valueOf("2019-04-04"),null));
        Virement v2 = virementrepo.save(new Virement(null, 500L, Date.valueOf("2019-04-04"),null));
        Virement v3 = virementrepo.save(new Virement(null, 600L, Date.valueOf("2019-04-04"),null));
        etudiantrepo.save(new Etudiant(null,456789L,2500f,true,v2,null,null,null,null));
        etudiantrepo.save(new Etudiant(null,456789L,2500f,true,v2,null,null,null,null));
        etudiantrepo.save(new Etudiant(null,456789L,2500f,true,v2,null,null,null,null));

        etudiantrepo.save(new Etudiant(null,456789L,2500f,true,v2,null,null,null,null));
        etudiantrepo.save(new Etudiant(null,456789L,2500f,true,v2,null,null,null,null));
        etudiantrepo.save(new Etudiant(null,456789L,2500f,true,v2,null,null,null,null));
        etudiantrepo.save(new Etudiant(null,456789L,2500f,true,v2,null,null,null,null));

    }
}
