package sg.edu.iss.carparkPrediction;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import sg.edu.iss.carparkPrediction.Repository.carparkPredictionRepository;
import sg.edu.iss.carparkPrediction.model.Carpark;

@SpringBootApplication
public class CarparkPredictionApplication implements WebMvcConfigurer {
	
	@Autowired
	carparkPredictionRepository cpprepo;
	
	@Bean
	@Transactional
	CommandLineRunner runner() {
		return args -> {
		
			Carpark cp1 = new Carpark("Jurong East", "Westgate", 30, LocalDate.of(2021, 8, 1),"00:00");
			Carpark cp2 = new Carpark("Jurong East", "Westgate", 40, LocalDate.of(2021, 8, 1), "06:00");
			Carpark cp3 = new Carpark("Jurong East", "Westgate", 50, LocalDate.of(2021, 8, 1), "12:00");
			Carpark cp4 = new Carpark("Jurong East", "Westgate", 60, LocalDate.of(2021, 8, 1), "18:00");
			Carpark cp5 = new Carpark("Jurong East", "Westgate", 70, LocalDate.of(2021, 8, 1), "24:00");
			cpprepo.save(cp1);
			cpprepo.save(cp2);
			cpprepo.save(cp3);
			cpprepo.save(cp4);
			cpprepo.save(cp5);
					
//					Area = area;
//			Address = address;
//			AvailableLots = availableLots;
//			this.datetime = datetime;
		
		
		};
	}
	

	
	public static void main(String[] args) {
		SpringApplication.run(CarparkPredictionApplication.class, args);
		
	}
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("landing-page");
	}

}
