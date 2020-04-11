package tplivesubdomaines.formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import tplivesubdomaines.formation.Entities.Formation;
import tplivesubdomaines.formation.doa.FormationRepository;

@SpringBootApplication
public class FormationApplication implements CommandLineRunner {
    @Autowired
    FormationRepository formationrepo;
    @Autowired
    RepositoryRestConfiguration reporestconf;
    public static void main(String[] args) {
        SpringApplication.run(FormationApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        reporestconf.exposeIdsFor(Formation.class);
        Formation f1=  formationrepo.save(new Formation(null, "Java",30));
        Formation f2= formationrepo.save(new Formation(null, "Angular",40));
    }
}
