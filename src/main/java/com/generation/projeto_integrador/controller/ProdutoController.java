package com.generation.projeto_integrador.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.projeto_integrador.model.Categoria;
import com.generation.projeto_integrador.model.Produto;
import com.generation.projeto_integrador.repository.CategoriaRepository;
import com.generation.projeto_integrador.repository.ProdutoRepository;
import com.generation.projeto_integrador.service.ProdutoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;
    
    @Autowired
    private ProdutoService produtoService;
    
    @GetMapping
    public ResponseEntity<List<Produto>> getAll() {
        return ResponseEntity.ok(produtoRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> getById(@PathVariable @NonNull Long id) {
        return produtoRepository.findById(id)
                .map(resposta -> ResponseEntity.ok(resposta))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<Produto>> getByNome(@PathVariable String nome) {
        return ResponseEntity.ok(produtoRepository.findAllByNomeContainingIgnoreCase(nome));
    }

    // Método GET atualizado para buscar pela descrição da Categoria
    @GetMapping("/categoria/{descricao}")
    public ResponseEntity<List<Produto>> getByCategoria(@PathVariable String descricao) {
        return ResponseEntity.ok(produtoRepository.findAllByCategoriaDescricaoContainingIgnoreCase(descricao));
    }
    
    @GetMapping("/saudaveis")
    public ResponseEntity<List<Produto>> getProdutosSaudaveis() {

        return ResponseEntity.ok(
                produtoService.recomendarProdutosSaudaveis()
        );
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<Produto> post(@Valid @RequestBody Produto produto) {

        Categoria categoria = categoriaRepository.findById(produto.getCategoria().getId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Categoria não existe!"));


        produto.setCategoria(categoria);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(produtoRepository.save(produto));
    }


    @PutMapping("/atualizar")
    public ResponseEntity<Produto> put(@Valid @RequestBody Produto produto) {
        if (produtoRepository.existsById(produto.getId())) {
            

            Categoria categoria = categoriaRepository.findById(produto.getCategoria().getId())
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Categoria não existe!"));
            

            produto.setCategoria(categoria);

            return ResponseEntity.status(HttpStatus.OK)
                    .body(produtoRepository.save(produto));
        }
        
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable @NonNull Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);

        if (produto.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
            
        produtoRepository.deleteById(id);
    }
}