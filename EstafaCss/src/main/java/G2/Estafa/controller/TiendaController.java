package G2.Estafa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import G2.Estafa.model.Mensaje;
import G2.Estafa.model.Tienda;
import G2.Estafa.model.Usuario;
import G2.Estafa.repository.TiendaRepository;
import G2.Estafa.service.MensajeService;
import G2.Estafa.service.TiendaService;
import G2.Estafa.service.UsuarioService;
//import G2.Estafa.service.UsuarioService;
@Controller
public class TiendaController {
	@Autowired
	TiendaService tiendaservice;
	
	@Autowired
	MensajeService mensajeservice;
	
	@Autowired
	UsuarioService usuarioservice;
	
	
	@RequestMapping("/tienda")
	public String listadotiendas(Model model) {
		List<Tienda> tiendas = tiendaservice.getAll();
		
		model.addAttribute("ListaTiendas", tiendas);
		
		return "tienda/index";
	}
	@RequestMapping("/tienda/add")
	public String addTienda(Model model) {
		model.addAttribute("tienda", new Tienda());
		return "tienda/add";
	}
	
	
	
	
	@PostMapping("/tienda/save")
	public String saveTienda(Tienda t) {
		tiendaservice.save(t);
		return "redirect:/tienda";
	}
	
	@RequestMapping("/tienda/view/{nombre}")
    public String viewtiendas(@PathVariable("nombre") String nombre, Model model) {
        Tienda tienda = tiendaservice.getById(nombre);
        model.addAttribute("tienda", tienda);
        Mensaje mensaje = new Mensaje();
        mensaje.setTienda(tienda);
        model.addAttribute("mensaje", mensaje );
		model.addAttribute("listausuarios", usuarioservice.getAll());
        return "tienda/view";
    }
	
	
	
	@RequestMapping("/tienda/neg/{nombre}")
    public String negativa(@PathVariable("nombre") String nombre) {
        tiendaservice.neg(nombre);

        return "redirect:/tienda/view/{nombre}";
    }
	
	@RequestMapping("/tienda/pos/{nombre}")
    public String positiva(@PathVariable("nombre") String nombre) {
        tiendaservice.pos(nombre);

        return "redirect:/tienda/view/{nombre}";
    }
	

}
