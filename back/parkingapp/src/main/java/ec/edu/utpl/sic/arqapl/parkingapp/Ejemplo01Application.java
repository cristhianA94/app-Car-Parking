package ec.edu.utpl.sic.arqapl.parkingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackages = {"ec.edu.utpl.sic.arqapl.parkingapp.Persistence.Entities"})
//@EntityScan("ec.edu.utpl.sic.arqapl.parkingapp.Persistence.Entities")
//@EnableJpaRepositories("ec.edu.utpl.sic.arqapl.parkingapp.Persistence.Controllers")
public class Ejemplo01Application {

    public static void main(String[] args) {
        SpringApplication.run(Ejemplo01Application.class, args);
    }

}
