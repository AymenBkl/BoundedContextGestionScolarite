package tplivesubdomaines.scolarit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import tplivesubdomaines.scolarit.Entities.Etablisment;
import tplivesubdomaines.scolarit.Entities.Etudiant;
import tplivesubdomaines.scolarit.doa.EtablismentRepository;
import tplivesubdomaines.scolarit.doa.EtudiantRepository;

import java.sql.Date;

@SpringBootApplication
@EnableFeignClients
public class ScolaritéApplication implements CommandLineRunner {

    @Autowired
    EtudiantRepository repoetudiant;
    @Autowired
    EtablismentRepository repoetablisment;

    public static void main(String[] args) {
        SpringApplication.run(ScolaritéApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Etablisment e1 = repoetablisment.save(new Etablisment(null,"esi-sba",null));
        Etablisment e2 = repoetablisment.save(new Etablisment(null,"esi-alger",null));
        repoetudiant.save(new Etudiant(null,"malki", Date.valueOf("1999-01-01"),"4isi",null,e1,1L,null));
        repoetudiant.save(new Etudiant(null,"malki", Date.valueOf("1999-01-01"),"4isi",null,e1,1L,null));
        repoetudiant.save(new Etudiant(null,"malki", Date.valueOf("1999-01-01"),"4isi",null,e1,1L,null));
        repoetudiant.save(new Etudiant(null,"malki", Date.valueOf("1999-01-01"),"4isi",null,e1,1L,null));


    }
}
