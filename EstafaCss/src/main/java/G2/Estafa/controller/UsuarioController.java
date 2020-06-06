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
	
	
	@RequestMapping("/usuarios")
	public String listadomoderadores(Model model) {
		List<Usuario> usuarios = usuarioservice.getAll();
		
		model.addAttribute("ListaUsuarios", usuarios);
		
		return "usuarios/index";
	}
	@RequestMapping("/usuarios/add")
	public String addusuarios(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "usuarios/add";
	}
	@RequestMapping("/usuarios/login")
    public String loginusuarios() {
        
        return "usuarios/login";
    }
	@RequestMapping("/usuarios/contacta")
    public String contactausuarios() {
        
        return "usuarios/contacta";
    }
	@PostMapping("/usuarios/conectar")
	public String comprobar(@RequestParam("nick") String nick, @RequestParam("password") String pas) {
		if (usuarioservice.comprobar(nick, pas)!=null)
			return "redirect:/usuarios";
		return "redirect:/usuarios/login";
	}
	
	@RequestMapping("/usuarios/denuncias")
    public String listadousuarios(Model model) {
        List<Usuario> usa = usuarioservice.getAll();

        model.addAttribute("ListaUsuarios", usa);

        return "usuarios/denuncias";
    }
	@RequestMapping("/usuarios/denun/{nick}")
    public String comprobar(@PathVariable("nick") String nick) {
        usuarioservice.denuncia(nick);

        return "redirect:/usuarios/denuncias";
    }
	
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
		return "redirect:/moderadores";
	}

}
