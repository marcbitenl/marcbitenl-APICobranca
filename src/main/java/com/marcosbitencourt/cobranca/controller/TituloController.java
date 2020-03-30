package com.marcosbitencourt.cobranca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marcosbitencourt.cobranca.model.Titulo;
import com.marcosbitencourt.cobranca.repository.Titulos;



@Controller
@RequestMapping("/titulos")
public class TituloController {
	
	
	@Autowired// auto-injeta e trabalha com a interface Titulos
	private Titulos titulos;

	@RequestMapping("/novo")
	public String novo() {
		return "CadastroTitulo";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Titulo titulo) {
		System.out.println(">>> " + titulo.getDescricao());
		
		
		
		titulos.save(titulo);
		return "CadastroTitulo";
	}
	
}