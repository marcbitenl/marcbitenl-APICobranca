package com.marcosbitencourt.cobranca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TituloController {

	@RequestMapping("/titulo/novo") //URL que será mapeada e irá chamar a  view abaixo
	public String novo() {
		return "CadastroTitulo";
	}
	
}
