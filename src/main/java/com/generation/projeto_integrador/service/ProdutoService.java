package com.generation.projeto_integrador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.projeto_integrador.model.Produto;
import com.generation.projeto_integrador.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	  @Autowired
	    private ProdutoRepository produtoRepository;
	
    public List<Produto> recomendarProdutosSaudaveis() {
        return produtoRepository.findBySaudavelTrueAndDisponivelTrue();
    }
}
