package com.ejemplo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ejemplo.model.Persona;
import com.ejemplo.repository.ServiceRepository;

@Component
public class ServiceServiceImpl implements ServiceService{

	@Autowired
	ServiceRepository repository;
	
	@Override
	public Persona get(long id) {
		Persona persona = repository.get(id);
		return persona;
	}

	@Override
	public Persona post(Persona persona) {
		return repository.add(persona);
	}

	@Override
	public List<Persona> get() {
		return repository.get();
	}

}
