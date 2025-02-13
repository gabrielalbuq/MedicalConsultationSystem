package com.gmg.systemweb.security.web.controller;

<<<<<<< HEAD
import javax.servlet.http.HttpServletResponse;

=======
>>>>>>> 634f6f3b34a1e3956b3cf80ed0e7eaf55f68d55d
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	// abrir pagina home
	@GetMapping({"/","/home"})
	public String home() {
		return "home";
	}	
	
	// abrir página login
	@GetMapping({"/login"})
	public String login() {
		return "login";
	}
		
	// login inválido
	@GetMapping({"/login-error"})
	public String loginError(ModelMap model) {
		model.addAttribute("alerta", "erro");
		model.addAttribute("titulo", "Crendenciais inválidas!");
		model.addAttribute("texto", "Login ou senha incorretos, tente novamente");
		model.addAttribute("subtexto", "Acesso permitido apenas para cadastros já ativados.");
		return "login";
	}
<<<<<<< HEAD
	
	// acesso negado
	@GetMapping({"/acesso-negado"})
	public String acessoNegado(ModelMap model, HttpServletResponse resp) {
		model.addAttribute("status", resp.getStatus());
		model.addAttribute("error", "Acesso Negado");
		model.addAttribute("message", "Você não tem permissão para acesso a esta área ou ação.");
		return "error";
	}
=======
>>>>>>> 634f6f3b34a1e3956b3cf80ed0e7eaf55f68d55d
}
