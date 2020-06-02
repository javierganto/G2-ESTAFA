package G2.Estafa.controller;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import G2.Estafa.model.Usuario;
import G2.Estafa.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioservice;
	
	
	@RequestMapping("/usuarios/add")
	public String addusuarios(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "usuarios/add";
	}
	@RequestMapping("/usuarios/login")
    public String loginusuarios() {
        
        return "usuarios/login";
    }
	@PostMapping("/usuarios/conectar")
	public String comprobar(@RequestParam("nick") String nick, @RequestParam("password") String pas) {
		if (usuarioservice.comprobar(nick, pas)!=null)
			return "redirect:/usuarios/view/"+nick;
		return "redirect:/usuarios/login";
	}
	/*
    @PostMapping("/usuarios/save")
    public String perfilusuario(Usuario u) {
        return "redirect:/view";

    }*/
	
	
	
	@PostMapping("/usuarios/save")
	public String saveUsuario(Usuario u) {
		usuarioservice.save(u);
		return "redirect:/usuarios";
	}
	@RequestMapping("/usuarios/edit/{nick}")
	public String editusuarios(@PathVariable("nick") String nick, Model model) {
		model.addAttribute("usuario", usuarioservice.getById(nick));
		return "usuarios/add";
	}
	
	@RequestMapping("/usuarios/view/{nick}")
	public String viewusuarios(@PathVariable("nick") String nick, Model model) {
		model.addAttribute("usuario", usuarioservice.getById(nick));
		return "usuarios/view";
	}
	@RequestMapping("/usuarios/delete/{nick}")
	public String deleteUsuarios(@PathVariable("nick") String nick) {
		usuarioservice.delete(nick);
		return "redirect:/usuarios";
	}

}
