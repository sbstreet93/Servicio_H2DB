package com.ejemplo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ejemplo.model.Persona;

@Repository
public interface ServiceRepository {
	List<Persona> get();
	Persona get(long id);
	Persona add(Persona persona);
}
