package dmacc;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.House;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.HouseRepository;

@SpringBootApplication
public class SpringHousesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringHousesApplication.class, args);
	}
	
	@Autowired
	HouseRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		House a = appContext.getBean("house",House.class);
		a.setType("Ranch");
		a.setBedrooms(4);
		a.setBathrooms(2);
		a.setForSale(true);
		repo.save(a);
		
		
		((AbstractApplicationContext) appContext).close();
	}

}
