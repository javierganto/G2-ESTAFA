package G2.Estafa.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import G2.Estafa.model.Moderador;
import G2.Estafa.model.Usuario;
import G2.Estafa.service.ModeradorService;

public class ModeradorController {
	

	@Controller
	public class UsuarioController {
		
		@Autowired
		ModeradorService moderadorservice;
		
		@RequestMapping("/moderadores")
		public String listadomoderadores(Model model) {
			List<Usuario> moderadores = new ArrayList<>();
			Moderador p = new Moderador();
			p.setNombre("Ricardo");
			p.setApellidos("Lopez Bordoli");
			p.setNick("awakate");
			p.setEmail("ricardolobo2000@hotmail.com");
			p.setPassword("awakate");
			p.setValoracion(10);
			moderadores.add(p);
			
			p = new Moderador();
			p.setNombre("Javier");
			p.setApellidos("Garcia Antolin");
			p.setNick("javierganto");
			p.setEmail("javierganto@gmail.com");
			p.setPassword("javierganto");
			p.setValoracion(10);
			moderadores.add(p);
			
			p = new Moderador();
			p.setNombre("David");
			p.setApellidos("Lopez Bordoli");
			p.setNick("awakate");
			p.setEmail("ricardolobo2000@hotmail.com");
			p.setPassword("awakate");
			p.setValoracion(10);
			moderadores.add(p);
			
			p = new Moderador();
			p.setNombre("Ricardo");
			p.setApellidos("Lopez Bordoli");
			p.setNick("awakate");
			p.setEmail("ricardolobo2000@hotmail.com");
			p.setPassword("awakate");
			p.setValoracion(10);
			moderadores.add(p);
			
			p = new Moderador();
			p.setNombre("Ricardo");
			p.setApellidos("Lopez Bordoli");
			p.setNick("awakate");
			p.setEmail("ricardolobo2000@hotmail.com");
			p.setPassword("awakate");
			p.setValoracion(10);
			moderadores.add(p);
			
			model.addAttribute("ListaModeradores", moderadores);
			
			return "moderadores/index";
		}
		@RequestMapping("/moderadores/login")
	    public String loginmoderadores(String nick, String pas) {
	        moderadorservice.comprobar(nick,pas);
	        return "moderadores/login";
	    }
		/*
	    @PostMapping("/usuarios/save")
	    public String perfilusuario(Usuario u) {
	        return "redirect:/view";

	    }*/
		
		
		
		
		@RequestMapping("/moderadores/edit/{nick}")
		public String editmoderadores(@PathVariable("nick") String nick, Model model) {
			model.addAttribute("moderadores", moderadorservice.getById(nick));
			return "moderadores/add";
		}
		
		@RequestMapping("/moderadores/view/{nick}")
		public String viewmoderadores(@PathVariable("nick") String nick, Model model) {
			model.addAttribute("moderadores", moderadorservice.getById(nick));
			return "moderadores/view";
		}
		@RequestMapping("/moderadores/delete/{nick}")
		public String deletemoderadores(@PathVariable("nick") String nick) {
			moderadorservice.delete(nick);
			return "redirect:/moderadores";
		}

	}


}
