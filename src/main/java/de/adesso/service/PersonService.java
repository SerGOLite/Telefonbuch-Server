package de.adesso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.adesso.entity.Person;
import de.adesso.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository personRepository;

	// @Override
	public Person createPerson(Person person) {
		return personRepository.save(person);
	}

	// @Override
	public Person getPersonbyId(String id) {
		return personRepository.findById(id).get();
	}

	// @Override
	public List<Person> getAllPersons() {
		return personRepository.findAll();
	}

	public Person updatePerson(Person person) {
		return personRepository.save(person);
	}

	public String deletePerson(String id) {
		personRepository.deleteById(id);
		return "Person wurde gelöscht.";
	}

	public List<Person> getPersonsByName (String name) {
		return personRepository.findByName(name);
	}

	public List<Person> findAll() {
		return personRepository.findAll();
	}
}
