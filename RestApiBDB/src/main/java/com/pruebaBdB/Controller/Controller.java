package com.pruebaBdB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaBdB.interfaceService.IPersonService;
import com.pruebaBdB.model.Person;

@CrossOrigin
@RestController
@RequestMapping
public class Controller {

	@Autowired
	private IPersonService service;
	
	@GetMapping("list")
	public List<Person> list() {
		return service.list();
	}
	
	@PostMapping("save")
	public Person save(@RequestBody Person p) {
		service.save(p);
		return p;
	}
	
	@RequestMapping(value="find/{id}")
	public Person findById(@PathVariable("id") String id ) {
		return service.findByIdent(id);
	}
}