package com.generation.projeto_integrador.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.projeto_integrador.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // Método corrigido: Agora ele entra no objeto Categoria e busca pelo atributo "descricao"
    public List<Produto> findAllByCategoriaDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

    // Buscar por nome.
    public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}