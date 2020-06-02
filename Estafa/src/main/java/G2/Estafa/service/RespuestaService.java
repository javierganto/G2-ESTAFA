package G2.Estafa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import G2.Estafa.model.Respuesta;
import G2.Estafa.repository.RespuestaRepository;

public class RespuestaService {
	@Autowired
	RespuestaRepository respuestaRepository;
	public List<Respuesta> getAll(){
		return respuestaRepository.findAll();
	}
	
	public void save(Respuesta r) {
		respuestaRepository.saveAndFlush(r);
	}

	public void delete(String autor) {
		respuestaRepository.deleteById(autor);
	}
	
	public Respuesta getById(String autor) {
		return respuestaRepository.getOne(autor);
	}
}
