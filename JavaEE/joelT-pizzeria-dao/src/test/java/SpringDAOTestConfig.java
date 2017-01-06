import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan("fr.dao")
public class SpringDAOTestConfig {

	@Bean
	public LocalEntityManagerFactoryBean EntityManager() {
		LocalEntityManagerFactoryBean entity = new LocalEntityManagerFactoryBean();
		entity.setPersistenceUnitName("joelT-pizzeria-console");
		return entity;
	}

	@Bean
	public PlatformTransactionManager txManager() {
		return new JpaTransactionManager();
	}
}
