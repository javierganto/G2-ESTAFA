package G2.Estafa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import G2.Estafa.model.Tienda;
import G2.Estafa.service.TiendaService;
//import G2.Estafa.service.UsuarioService;
@Controller
public class TiendaController {
	@Autowired
	TiendaService tiendaservice;
	
	@RequestMapping("/tiendas")
	public String listadotiendas(Model model) {
		List<Tienda> tiendas = tiendaservice.getAll();
		
		model.addAttribute("ListaTiendas", tiendas);
		
		return "tiendas/index";
	}
	@RequestMapping("/tiendas/add")
	public String addTienda(Model model) {
		model.addAttribute("tienda", new Tienda());
		return "tiendas/add";
	}
	
	
	
	
	@PostMapping("/tiendas/save")
	public String saveTienda(Tienda t) {
		tiendaservice.save(t);
		return "redirect:/tiendas";
	}
	@RequestMapping("/tiendas/edit/{id}")
	public String editTienda(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("Tienda", tiendaservice.getById(id));
		return "tiendas/add";
	}
	
	@RequestMapping("/tienda/view/{id}")
    public String viewtiendas(@PathVariable("id") Integer id, Model model) {
        Tienda tienda = tiendaservice.getById(id);
        model.addAttribute("tienda", tienda);
        Mensaje mensaje = new Mensaje();
        mensaje.setTienda(tienda);
        model.addAttribute("mensaje", mensaje );
        return "tienda/view";
    }
	@RequestMapping("/tiendas/delete/{nombre}")
	public String deleteTiendas(@PathVariable("nombre") String nombre) {
		tiendaservice.delete(nombre);
		return "redirect:/tiendas";
	}

}
