import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import fr.dao.PizzaDaoFactory;
import fr.dao.PizzaDaoTableau;

@Configuration
@ComponentScan("fr.ihm.action")
public class SpringTestConfig {
	@Bean
	public PizzaDaoFactory pizzaDao() {
		PizzaDaoFactory test = new PizzaDaoTableau();
		return test;
	}

	@Bean
	public Scanner scanner() { // On utilise @Bean ici pour ne pas scanner La
								// classe Scanner ou son package que nous ne
								// pouvons pas modifier
		return new Scanner(System.in);
	}
}