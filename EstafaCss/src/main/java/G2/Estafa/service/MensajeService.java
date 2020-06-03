package G2.Estafa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import G2.Estafa.model.Mensaje;

import G2.Estafa.repository.MensajeRepository;


public class MensajeService {
	@Autowired
	MensajeRepository mensajerepository;
	
	public List<Mensaje> getAll(){
		return mensajerepository.findAll();
	}
	
	public void save(Mensaje m) {
		mensajerepository.saveAndFlush(m);
	}

	public void delete(String autor) {
		mensajerepository.deleteById(autor);
	}
	public Mensaje getById(String autor) {
		return mensajerepository.getOne(autor);
	}


}
