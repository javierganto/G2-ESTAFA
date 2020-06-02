package G2.Estafa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import G2.Estafa.model.Respuesta;
import G2.Estafa.service.RespuestaService;

public class RespuestaController {
	@Autowired
	RespuestaService respuestaService;
	
	@RequestMapping("/respuestas")
	public String listadoRespuestas(Model model) {
		List<Respuesta> respuestas = respuestaService.getAll();
		
		model.addAttribute("ListaRespuestas", respuestas);
		
		return "respuestas/index";
	}
	@RequestMapping("/respuestas/add")
	public String addTienda(Model model) {
		model.addAttribute("respuesta", new Respuesta());
		return "respuestas/add";
	}
	@PostMapping("/respuestas/save")
	public String saveRespuesta(Respuesta r) {
		respuestaService.save(r);
		return "redirect:/respuestas";
	}
	@RequestMapping("/respuestas/edit/{nombre}")
	public String editRespuestas(@PathVariable("nombre") String nombre, Model model) {
		model.addAttribute("Respuesta", respuestaService.getById(nombre));
		return "respuestas/add";
	}
	
	@RequestMapping("/respuestas/view/{nick}")
	public String viewRespuestas(@PathVariable("nick") String nick, Model model) {
		model.addAttribute("tienda", respuestaService.getById(nick));
		return "respuestas/view";
	}
	@RequestMapping("/respuestas/delete/{nombre}")
	public String deleteRespuestas(@PathVariable("nombre") String nombre) {
		respuestaService.delete(nombre);
		return "redirect:/respuestas";
	}
}
