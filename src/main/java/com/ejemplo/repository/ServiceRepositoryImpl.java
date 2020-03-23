package com.ejemplo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ejemplo.model.Persona;

@Component
public class ServiceRepositoryImpl implements ServiceRepository{

	@Autowired
	JpaRepository repository;
	
	@Override
	public Persona get(long id) {
		Optional<Persona> persona = repository.findById(id);
		return !persona.isPresent() ? null : persona.get(); 
	}

	@Override
	public Persona add(Persona persona) {
		persona = repository.saveAndFlush(persona);
		return persona;
	}

	@Override
	public List<Persona> get() {
		return repository.findAll();
	}

	
}
