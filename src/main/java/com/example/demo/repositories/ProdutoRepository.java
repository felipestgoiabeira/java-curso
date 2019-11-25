package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
