package de.adesso.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Person")
public class Person {

	@Id
	private String id;

	@Field(name = "Name")
	private String name;

	@Field(name = "Adresse")
	private String adresse;

	@Field(name = "Telefonnummer")
	private String telefonnummer;

	// Kein Constructor wird benötigt

	// Die Subdokumente sind als Classen kreiren und hier deklarieren z.B.
	// privat Departament departament;
	// privat List<Subject> subjects;

	// Getter - Setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

}
