package com.generation.projeto_integrador.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.projeto_integrador.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllByEmailContainingIgnoreCase(String id);

}
