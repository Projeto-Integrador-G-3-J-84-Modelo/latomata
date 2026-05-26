package com.generation.projeto_integrador.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Nome obrigatório")
	@Size(min = 2, max = 100)
	private String nome;

	@NotBlank(message = "Categoria obrigatória")
	@Size(min = 2, max = 50)
	private String categoria;


	@NotNull(message = "Preço obrigatório")
	private BigDecimal preco;

	@NotNull(message = "Disponibilidade obrigatória")
	private Boolean disponivel;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getCategoria() {
		return categoria;
	}

	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	
	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	
	public Boolean getDisponivel() {
		return disponivel;
	}

	
	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
	

}