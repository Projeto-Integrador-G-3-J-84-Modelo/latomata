package com.generation.projeto_integrador.model;

import java.util.List;
import java.util.Objects;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O Atributo Nome é Obrigatório!")
	@Size(min = 3, max = 100, message = "O Atributo nome deve ter no mínimo 3 caracteres e no máximo 100" )
	private String nome;

	@NotBlank(message = "O Atributo Email é Obrigatório!")
	@Email(message = "O Atributo Email deve ser um email válido!")
	private String email;

	@Size(max = 100, message = "O link da foto não pode ser maior do que 100 caracteres")
	private String foto;

	@NotBlank(message = "O Atributo Senha é Obrigatório!")
	@Size(min = 8, message = "A Senha deve ter no mínimo 8 caracteres")
	private String senha;

	@NotBlank(message = "O Atributo Tipo é Obrigatório!")
	private String tipo;

	@NotBlank(message = "O Atributo Endereço é Obrigatório!")
	@Size(max = 255, message = "O endereço não pode ser maior do que 255 caracteres")
	private String endereco;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties(value = "usuario", allowSetters = true)
	private List<Produto> produto;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

}