package com.generation.projeto_integrador.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.generation.projeto_integrador.model.Usuario;
import com.generation.projeto_integrador.model.UsuarioLogin;
import com.generation.projeto_integrador.repository.UsuarioRepository;
import com.generation.projeto_integrador.security.JwtService;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private JwtService jwtService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public List<Usuario> getAll() {
		return usuarioRepository.findAll();
	}

	public Optional<Usuario> getById(@NonNull Long id) {
		return usuarioRepository.findById(id);
	}

	public Optional<Usuario> cadastrarUsuario(Usuario usuario) {

		if (usuarioRepository.findByEmail(usuario.getEmail()).isPresent()) {
			return Optional.empty();
		}

		usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
		
		return Optional.of(usuarioRepository.save(usuario));
	}

	public Optional<Usuario> atualizarUsuario(Usuario usuario) {

		Long id = Objects.requireNonNull(usuario.getId(), "O id do usuário é obrigatório.");
		
		if (!usuarioRepository.findById(id).isPresent()) {
			return Optional.empty();
		}

		Optional<Usuario> usuarioExistente = usuarioRepository.findByEmail(usuario.getEmail());
		
		if (usuarioExistente.isPresent() && !usuarioExistente.get().getId().equals(id)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuário já existe!", null);
		}

		usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
		return Optional.of(usuarioRepository.save(usuario));
	}
	
	public Optional<UsuarioLogin> autenticarUsuario(Optional<UsuarioLogin> usuarioLogin) {

		if (!usuarioLogin.isPresent()) {
			return Optional.empty();
		}

		UsuarioLogin login = usuarioLogin.get();
		
		try {
 
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(login.getEmail(), login.getSenha()));

			return usuarioRepository.findByEmail(login.getEmail())
				.map(usuario -> construirRespostaLogin(login, usuario));

		} catch (Exception e) {

			return Optional.empty();
		}
	}

	private UsuarioLogin construirRespostaLogin(UsuarioLogin usuarioLogin, Usuario usuario) {
		
		usuarioLogin.setId(usuario.getId());
		usuarioLogin.setNome(usuario.getNome());
		usuarioLogin.setSenha("");
		usuarioLogin.setToken(gerarToken(usuario.getEmail()));
		return usuarioLogin;
		
	}

	private String gerarToken(String usuario) {
		return "Bearer " + jwtService.generateToken(usuario);
	}
	
	public boolean deletarUsuario(@NonNull Long id) {
	    
	    
	    if (usuarioRepository.existsById(id)) {
	        usuarioRepository.deleteById(id);
	        return true; 
	    }
	    
	    return false; 
	}
	
}

