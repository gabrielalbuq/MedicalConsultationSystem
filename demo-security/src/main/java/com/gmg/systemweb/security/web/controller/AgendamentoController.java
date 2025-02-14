package com.gmg.systemweb.security.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gmg.systemweb.security.domain.Agendamento;

@Controller
@RequestMapping("agendamentos")
public class AgendamentoController {
	
	// abre a pagina de agendamento de consultas 
	@GetMapping({"/agendar"})
	public String agendarConsulta(Agendamento agendamento) {

		return "agendamento/cadastro";		
	}
}
