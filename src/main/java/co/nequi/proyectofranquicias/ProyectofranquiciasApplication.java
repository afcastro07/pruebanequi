package co.nequi.proyectofranquicias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ProyectofranquiciasApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProyectofranquiciasApplication.class, args);
	}
}