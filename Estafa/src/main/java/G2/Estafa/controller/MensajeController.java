package G2.Estafa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import G2.Estafa.model.Mensaje;
import G2.Estafa.model.Usuario;
import G2.Estafa.service.MensajeService;


public class MensajeController {

	@Autowired
	MensajeService mensajeservice;
	
	@RequestMapping("/mensajes/"/*{nick}*/)
	public String listadousuarios(Model model) {
		List<Mensaje> mensaje = mensajeservice.getAll();
		
		model.addAttribute("ListaMensajes", mensaje);
		
		return "mesajes/index";
	}
	@RequestMapping(/*/tiendas/{id}/*/"/mensajes/add")
	public String addusuarios(Model model) {
		model.addAttribute("mensaje", new Mensaje());
		return "usuarios/add";
	}
	@PostMapping("/mensajes/save")
	public String saveUsuario(Mensaje m) {
		mensajeservice.save(m);
		return "redirect:/mensajes";
	}
	@RequestMapping("/mensajes/edit/{nick}")
	public String editusuarios(@PathVariable("nick") String autor, Model model) {
		model.addAttribute("usuario", mensajeservice.getById(autor));
		return "usuarios/add";
	}
	
	@RequestMapping("/usuarios/delete/{nick}")
	public String deleteUsuarios(@PathVariable("autor") String autor) {
		mensajeservice.delete(autor);
		return "redirect:/usuarios";
	}
	@RequestMapping("/usuarios")
	public String listadomensajes(Model model) {
		List<Mensaje> mensajes = mensajeservice.getAll();
		
		model.addAttribute("ListaMensajes", mensajes);
		
		return "mensajes/index";
	}
}
