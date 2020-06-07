package G2.Estafa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import G2.Estafa.model.Mensaje;
import G2.Estafa.model.Tienda;
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
	
	public void neg(Integer id) {
		 try {
		        Mensaje mensaje = mensajerepository.getOne(id);
		        mensaje.neg();
		        mensajerepository.saveAndFlush(mensaje);
		        }
		        catch(Exception e){

		        }
		
	}
	public void pos(Integer id) {
		 try {
		        Mensaje mensaje = mensajerepository.getOne(id);
		        mensaje.pos();
		        mensajerepository.saveAndFlush(mensaje);
		        }
		        catch(Exception e){

		        }
		
	}


}
