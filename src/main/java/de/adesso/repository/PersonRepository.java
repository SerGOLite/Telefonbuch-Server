package de.adesso.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import de.adesso.entity.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> /* String weil id ist als String deklariert*/{
	
	List<Person> findByName(String name);
	
}
