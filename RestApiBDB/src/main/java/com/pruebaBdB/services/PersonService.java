package com.pruebaBdB.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaBdB.interfaceService.IPersonService;
import com.pruebaBdB.model.Person;
import com.pruebaBdB.repositories.PersonRepository;

@Service
public class PersonService implements IPersonService{

	@Autowired
	private PersonRepository data;
	
	@Override
	public int save(Person p) {
		int res = 0;
		Person person = data.save(p);
		if(!person.equals(null))
			res = 1;
		return res;
	}

	@Override
	public List<Person> list() {
		return (List<Person>) data.findAll();
	}

	@Override
	public void adopt(Person child) {
		
		
	}

	@Override
	public Person findByIdent(String id) {
		return data.findByIdent(id);
	}

}