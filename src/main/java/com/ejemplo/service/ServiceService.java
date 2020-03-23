package com.ejemplo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ejemplo.model.Persona;

@Service
public interface ServiceService {

	List<Persona> get();
	Persona get(long id);
	Persona post(Persona persona);
}
