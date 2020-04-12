package scolarite.scolarite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import scolarite.scolarite.Entities.Etablisment;
import scolarite.scolarite.Entities.Etudiant;
import scolarite.scolarite.doe.EtablismentRepository;
import scolarite.scolarite.doe.EtudiantRepository;

import java.sql.Date;

@SpringBootApplication
@EnableFeignClients
public class ScolariteApplication implements CommandLineRunner {
    @Autowired
    EtablismentRepository etablismentrepo;
    @Autowired
    EtudiantRepository etudiantrepo;
    public static void main(String[] args) {
        SpringApplication.run(ScolariteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Etablisment e1 = etablismentrepo.save(new Etablisment(null,"esi-sba",null));
        Etablisment e2 = etablismentrepo.save(new Etablisment(null,"esi-sba1",null));
        Etablisment e3 = etablismentrepo.save(new Etablisment(null,"esi-sba2",null));
        Etablisment e4 = etablismentrepo.save(new Etablisment(null,"esi-sba3",null));
        etudiantrepo.save(new Etudiant(null,"aymen",Date.valueOf("2016-06-06"),"A",Date.valueOf("2017-09-05"),e1,1L,null,null,null,null));
        etudiantrepo.save(new Etudiant(null,"aymen2",Date.valueOf("2016-06-06"),"B",Date.valueOf("2017-09-05"),e2,2L,null,null,null,null));
        etudiantrepo.save(new Etudiant(null,"aymen3",Date.valueOf("2016-06-06"),"C",Date.valueOf("2017-09-05"),e3,1L,null,null,null,null));
        etudiantrepo.save(new Etudiant(null,"aymen4",Date.valueOf("2016-06-06"),"D",Date.valueOf("2017-09-05"),e1,2L,null,null,null,null));



    }
}
