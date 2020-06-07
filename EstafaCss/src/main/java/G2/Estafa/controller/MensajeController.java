package G2.Estafa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import G2.Estafa.model.Mensaje;
import G2.Estafa.model.Tienda;
import G2.Estafa.model.Usuario;
import G2.Estafa.service.MensajeService;
import G2.Estafa.service.TiendaService;
import G2.Estafa.service.UsuarioService;

@Controller
public class MensajeController {

	@Autowired
	MensajeService mensajeservice;
	
	@Autowired
	TiendaService tiendaservice;
	
	@Autowired
	UsuarioService usuarioservice;
	
	@RequestMapping("/mensajes")
	public String listadomensajes(Model model) {
		List<Mensaje> mensaje = mensajeservice.getAll();
		model.addAttribute("listausuarios", usuarioservice.getAll());
		model.addAttribute("ListaMensajes",mensaje);
		
		return "mensajes/index";
	}
	@RequestMapping("/mensajes/add")
	public String addmensajes(Model model) {
		model.addAttribute("mensaje", new Mensaje());
		model.addAttribute("listausuarios", usuarioservice.getAll());
		model.addAttribute("listaTiendas", tiendaservice.getAll());
		return "mensajes/add";
	}
	@PostMapping("/mensajes/save")
	public String savemensaje(Mensaje m) {
		mensajeservice.save(m);
		return "redirect:/mensajes";
	}
	@RequestMapping("/mensajes/edit/{id}")
	public String editusmensaje(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("usuario", mensajeservice.getById(id));
		model.addAttribute("listaUsuarios", usuarioservice.getAll());
		model.addAttribute("listaTiendas", tiendaservice.getAll());
		return "mensajes/add";
	}
	@RequestMapping("/mensajes/view/{id}")
    public String viewmensajes(@PathVariable("id") Integer id, Model model) {
        Mensaje mensaje = mensajeservice.getById(id);
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("listatiendas", tiendaservice.getAll() );
		model.addAttribute("listausuarios", usuarioservice.getAll());
        return "mensajes/view";
    }
	
	@RequestMapping("/mensajes/delete/{id}")
    public String deletemensajes(@PathVariable("id") Integer id) {
        mensajeservice.delete(id);
        return "redirect:/mensajes";
    }
	
	@RequestMapping("/mensajes/neg/{id}")
    public String negativa(@PathVariable("id") Integer id) {
        mensajeservice.neg(id);
        
        return "redirect:/mensajes/view/{id}";
    }
	
	@RequestMapping("/mensajes/pos/{id}")
    public String positiva(@PathVariable("id") Integer id) {
        mensajeservice.pos(id);
        
        return "redirect:/mensajes/view/{id}";
    }
	
	
	
}
