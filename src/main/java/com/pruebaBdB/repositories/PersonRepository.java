package com.pruebaBdB.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pruebaBdB.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>{
	@Query(value = "SELECT * FROM person WHERE identification = :ident", nativeQuery = true)
	public Person findByIdent(@Param("ident") String id);
}