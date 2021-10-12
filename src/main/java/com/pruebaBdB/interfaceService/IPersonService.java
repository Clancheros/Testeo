package com.pruebaBdB.interfaceService;

import java.util.List;

import com.pruebaBdB.model.Person;

public interface IPersonService {
	public List<Person> list();
	public int save(Person p);
	public void adopt(Person child);
	public Person findByIdent(String id);
}