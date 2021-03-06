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
import G2.Estafa.service.UsuarioService;

@Controller
public class ModeradorController {
		
	@Autowired
	ModeradorService moderadorservice;
	@Autowired
	UsuarioService usuarioservice;
	
	
	
	@RequestMapping("/moderadores")
    public String listadomoderadores(Model model) {
        List<Usuario> mods = usuarioservice.getAll();

        model.addAttribute("ListaModeradores", mods);

        return "moderadores/index";
    }
	@RequestMapping("/moderadores/ListaUsuarios")
    public String listadomoderadores1(Model model) {
        List<Usuario> mods = usuarioservice.getAll();

        model.addAttribute("ListaModeradores", mods);

        return "moderadores/ListaUsuarios";
    }
	

	@RequestMapping("/moderadores/banear/{nick}")
	public String banearusuario(@PathVariable("nick") String nick) {
		usuarioservice.delete(nick);
		return "moderadores";
	}

	
	
	/*@RequestMapping("/moderadores/view/{nick}")
	public String viewmoderadores(@PathVariable("nick") String nick, Model model) {
		model.addAttribute("moderadores", moderadorservice.getById(nick));
		return "moderadores/view";
	}
	
	@RequestMapping("/moderadores/delete/usuarios")
	public String banearUsuario(Usuario u) {
		usuarioservice.delete(u.getNick());
		return "redirect:/moderadores";
	}
	
*/

}
