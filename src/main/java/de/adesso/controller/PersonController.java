package de.adesso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.adesso.entity.Person;
import de.adesso.service.PersonService;

@RestController
@RequestMapping("/api/person")
public class PersonController {

	@Autowired
	PersonService personService;

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/")
	public ResponseEntity<Person> createPerson(@RequestBody Person Person) {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!Hallo Request");
		return ResponseEntity.ok()
				.body(personService.createPerson(Person));
		
		
	}

	@GetMapping("/getById/{id}")
	public Person getPersonbyId(@PathVariable String id) {
		return personService.getPersonbyId(id);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Person>> getAllPersons(){
		return ResponseEntity.ok()
				.header("Access-Control-Allow-Origin", "*")
				.body(personService.findAll());	}
	
	@PutMapping("/update")
	public Person updatePerson(@RequestBody Person Person) {
		return personService.updatePerson(Person);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deletePerson(@PathVariable String id) {
		return personService.deletePerson(id);
	}
	
	@GetMapping("/personsByName/{Name}")
	public List<Person> personsByName(@PathVariable String Name){
		return personService.getPersonsByName(Name); 
	}
	
	
	
	
//	@OPTIONS
//	@Path("/getsample")
//	public Response getOptions() {
//		return Response.ok()
//				.header("Access-Control-Allow-Origin", "*")
//				.header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
//				.header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With header" )
//	}
	
}
