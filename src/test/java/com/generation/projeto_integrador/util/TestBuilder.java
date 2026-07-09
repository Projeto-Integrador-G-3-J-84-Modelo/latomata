package com.generation.projeto_integrador.util;

import com.generation.projeto_integrador.model.Usuario;
import com.generation.projeto_integrador.model.UsuarioLogin;

public class TestBuilder {
	public static Usuario criarUsuario(Long id, String nome, String usuario, String senha) {
		Usuario novoUsuario = new Usuario();
		novoUsuario.setId(id);
		novoUsuario.setNome(nome);
		novoUsuario.setEmail(usuario);
		novoUsuario.setSenha(senha);
		novoUsuario.setFoto("-");
		return novoUsuario;
	}

	public static UsuarioLogin criarUsuarioLogin(String usuario, String senha) {
		UsuarioLogin usuarioLogin = new UsuarioLogin();
		usuarioLogin.setEmail(usuario);
		usuarioLogin.setSenha(senha);
		return usuarioLogin;
	}
}