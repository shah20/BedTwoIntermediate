package com.wipro.BedTwoIntermediate;

import com.wipro.model.User;
import com.wipro.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.wipro.repositories")
@EntityScan(basePackages = "com.wipro.model")
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.wipro.controllers")
public class BedTwoIntermediateApplication implements CommandLineRunner{

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(BedTwoIntermediateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User adminRoger = new User("roger@gmail.com", "Roger", "Kutcher", "wipro@123", "admin");
		User adminSteve = new User("steve@gmail.com", "Steve", "Martin", "wipro@123", "admin");
		this.userRepository.save(adminRoger);
		this.userRepository.save(adminSteve);
		
	}
}
