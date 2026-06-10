package com.generation.projeto_integrador.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.generation.projeto_integrador.model.Usuario;

import io.jsonwebtoken.lang.Collections;

public class UserDetailsImpl implements UserDetails {

	private static final long serialVersionUID = 1L;

	private String username;
	private String password;
	private String tipo;

	public UserDetailsImpl(Usuario user) {
		this.username = user.getEmail();
		this.password = user.getSenha();
		this.tipo = user.getTipo();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(new SimpleGrantedAuthority("ROLE_" + this.tipo.toUpperCase()));
	}

	@Override
	public String getPassword() {

		return password;
	}

	@Override
	public String getUsername() {

		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
}
