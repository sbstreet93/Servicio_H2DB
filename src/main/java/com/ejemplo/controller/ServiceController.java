package com.ejemplo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.model.Persona;
import com.ejemplo.service.ServiceService;

@RestController
@RequestMapping("/api")
public class ServiceController {
	@Autowired
	ServiceService service;
	@GetMapping("/get")
	private List<Persona> get() {
		return service.get();
	}
	
	@GetMapping("/get/{id}")
	private Persona get(@PathVariable("id") long id) {
		return service.get(id);
	}
	
	@PostMapping("/post")
	private Persona post(@RequestBody Persona persona) {
		return service.post(persona);
	}
	
}
