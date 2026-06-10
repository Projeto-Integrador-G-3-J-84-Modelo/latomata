package com.generation.projeto_integrador.model;

import java.math.BigDecimal;
import java.util.Objects;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O nome do produto é obrigatório")
	@Size(min = 3, max = 100, message = "O Atributo nome deve ter no mínimo 3 caracteres e no máximo 100")
	private String nome;

	@NotNull(message = "Preço obrigatório")
	private BigDecimal preco;

	@NotNull(message = "Disponibilidade obrigatória")
	private Boolean disponivel;

	@NotBlank(message = "Foto obrigatória")
	private String foto;

	@NotBlank(message = "Descrição obrigatória")
	@Size(max = 200)
	private String descricao;
	
	@NotNull(message = "O atributo saudável é obrigatório")
	private Boolean saudavel;
	
	@ManyToOne
	@JsonIgnoreProperties(value = "produto", allowSetters = true)
	private Categoria categoria;

	@ManyToOne
	@JsonIgnoreProperties(value = "produto", allowSetters = true)
	@JsonIgnore
	private Usuario usuario;

	@NonNull
	public Long getId() {
		return Objects.requireNonNull(id, "id");
	}

	public void setId(@NonNull Long id) {
		this.id = Objects.requireNonNull(id, "id");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Boolean getSaudavel() {
		return saudavel;
	}

	public void setSaudavel(Boolean saudavel) {
		this.saudavel = saudavel;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}