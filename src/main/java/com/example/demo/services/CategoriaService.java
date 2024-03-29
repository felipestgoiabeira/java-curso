package com.example.demo.services;


import  com.example.demo.domain.Categoria;
import com.example.demo.exceptions.ObjectNotFoundException;
import  com.example.demo.repositories.CategoriaRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() ->{
			return new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName());
		});
		
	}
	
}
