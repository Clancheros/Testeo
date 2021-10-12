package com.pruebaBdB;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

import java.sql.Date;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.pruebaBdB.model.Person;
import com.pruebaBdB.repositories.PersonRepository;
import com.pruebaBdB.services.PersonService;

class RestApiBdbApplicationTests {
	
	@Mock
	private PersonRepository data;
	
	@InjectMocks
	private PersonService personService;
	
	private Person person;
	
	@BeforeEach
	void setup() {
		MockitoAnnotations.openMocks(this);
		
		person = new Person();
		person.setFullname("Cristian");
		person.setBirth(new Date(System.currentTimeMillis()));
		person.setDadIdentification("1234567");
		person.setIdentification("9876543");
		person.setMomIdentification("87643984");
	}
	
	@Test
	void save() {
		when(data.save(any(Person.class))).thenReturn(person);
		assertNotNull(personService.save(new Person()));
	}
	
	@Test
	void list() {
		when(data.findAll()).thenReturn(Arrays.asList(person));
		assertNotNull(personService.list());
	}
	
	@Test
	void findByIdent() {
		when(data.findByIdent(person.getIdentification())).thenReturn(person);
		assertNotNull(personService.findByIdent(person.getIdentification()));
	}
}
