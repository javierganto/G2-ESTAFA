package G2.Estafa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import G2.Estafa.model.Moderador;
import G2.Estafa.service.ModeradorService;

public class ModeradorController {
	

	@Controller
	public class UsuarioController {
		
		@Autowired
		ModeradorService moderadorservice;
		
		@RequestMapping("/moderadores")
		public String listadousuarios(Model model) {
			List<Moderador> moderadores = moderadorservice.getAll();
			
			model.addAttribute("ListaModeradores", moderadores);
			
			return "moderadores/index";
		}
		@RequestMapping("/moderadores/add")
		public String addusuarios(Model model) {
			model.addAttribute("moderadores", new Moderador());
			return "moderadores/add";
		}
		@RequestMapping("/moderadores/login")
	    public String loginusuarios(String nick, String pas) {
	        moderadorservice.comprobar(nick,pas);
	        return "moderadores/login";
	    }
		/*
	    @PostMapping("/usuarios/save")
	    public String perfilusuario(Usuario u) {
	        return "redirect:/view";

	    }*/
		
		
		
		@PostMapping("/moderadores/save")
		public String saveUsuario(Moderador m) {
			moderadorservice.save(m);
			return "redirect:/moderador";
		}
		@RequestMapping("/moderadores/edit/{nick}")
		public String editusuarios(@PathVariable("nick") String nick, Model model) {
			model.addAttribute("moderadores", moderadorservice.getById(nick));
			return "moderadores/add";
		}
		
		@RequestMapping("/moderadores/view/{nick}")
		public String viewusuarios(@PathVariable("nick") String nick, Model model) {
			model.addAttribute("moderadores", moderadorservice.getById(nick));
			return "moderadores/view";
		}
		@RequestMapping("/moderadores/delete/{nick}")
		public String deleteUsuarios(@PathVariable("nick") String nick) {
			moderadorservice.delete(nick);
			return "redirect:/moderadores";
		}

	}


}
