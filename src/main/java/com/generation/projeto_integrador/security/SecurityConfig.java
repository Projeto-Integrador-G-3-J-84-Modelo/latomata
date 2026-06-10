package com.generation.projeto_integrador.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import jakarta.servlet.http.HttpServletResponse;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	private static final String[] PUBLIC_ENDPOINTS = {
	        "/usuarios/logar",
	        "/usuarios/cadastrar",
	        "/error/**",
	        "/"
	        };
	
	private static final String[] PUBLIC_GET_ENDPOINTS = {
	        "/produtos/**",
	        "/categorias/**",
	        "/produtos/recomendados",
	        "/error/**",
	        "/"
	};
	
	@Autowired
    private JwtAuthFilter jwtAuthFilter;
	
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(10);
    }
	
	@Bean
    AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	    return http
	    		.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
	            .csrf(csrf -> csrf.disable())
	            .cors(cors -> {})
	            
	            .authorizeHttpRequests(auth -> auth
	                // 1. Endpoints de Login/Cadastro (Públicos)
	                .requestMatchers(PUBLIC_ENDPOINTS).permitAll()
	                
	                // 2. TODOS os outros GETs são públicos, EXCETO os que começam com /usuarios
	                .requestMatchers(HttpMethod.GET, "/usuarios/**").authenticated() // Bloqueia GET de usuários
	                .requestMatchers(HttpMethod.GET, "/**").permitAll()             // Libera TODOS os outros GETs
	                
	                // 3. Regras de Escrita (Post/Put/Delete) continuam protegidas
	                .requestMatchers(HttpMethod.POST, "/produtos/**").hasRole("FUNCIONARIO")
	                .requestMatchers(HttpMethod.PUT, "/produtos/**").hasRole("FUNCIONARIO")
	                .requestMatchers(HttpMethod.DELETE, "/produtos/**").hasRole("FUNCIONARIO")
	                .requestMatchers(HttpMethod.POST, "/categorias/cadastrar").hasRole("FUNCIONARIO")
	                .requestMatchers(HttpMethod.POST, "/categorias/**").hasRole("FUNCIONARIO")
	                .requestMatchers(HttpMethod.PUT, "/categorias/**").hasRole("FUNCIONARIO")
	                .requestMatchers(HttpMethod.DELETE, "/categorias/**").hasRole("FUNCIONARIO")
	                
	                .anyRequest().authenticated()
	        )
	        
	        .exceptionHandling(exceptions -> exceptions
	                .authenticationEntryPoint((request, response, authException) -> 
	                    response.sendError(HttpServletResponse.SC_UNAUTHORIZED, 
	                        "Não autorizado - Token JWT ausente ou inválido"))
	                // Opcional: Adicionar tratamento para 403 Forbidden
	                .accessDeniedHandler((request, response, accessDeniedException) ->
	                    response.sendError(HttpServletResponse.SC_FORBIDDEN, 
	                        "Acesso negado - Você não tem permissão de funcionário"))
	        )
			.addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
			.build();
		}
}
