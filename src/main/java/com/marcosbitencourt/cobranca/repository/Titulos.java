package com.marcosbitencourt.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosbitencourt.cobranca.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long> {// <Repositorio,tipo de dado>
	
	

}
