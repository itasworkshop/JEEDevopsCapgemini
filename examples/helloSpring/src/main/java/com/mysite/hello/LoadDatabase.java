package com.mysite.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
	
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase(StudentRepository repository) {
		return args -> {
			log.info("Loading " + repository.save(new Student("Rajesh")));
			//System.out.println(repository.save(new Student("Rajesh")));
			log.info("Loading " + repository.save(new Student("Tommmy")));
			log.info("Loading " + repository.save(new Student("John")));
		};
		
	}

}
