package de.adesso.telefonbuch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories ("de.adesso.repository")
@ComponentScan("de.adesso.*")
public class TelefonbuchApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelefonbuchApplication.class, args);
	}

}
