package G2.Estafa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import G2.Estafa.model.Mensaje;

import G2.Estafa.repository.MensajeRepository;

@Service
public class MensajeService {
	@Autowired
	MensajeRepository mensajerepository;
	
	public List<Mensaje> getAll(){
		return mensajerepository.findAll();
	}
	
	public void save(Mensaje m) {
		mensajerepository.saveAndFlush(m);
	}

	public void delete(Integer id) {
		mensajerepository.deleteById(id);
	}
	public Mensaje getById(Integer id) {
		return mensajerepository.getOne(id);
	}


}
