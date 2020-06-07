package G2.Estafa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import G2.Estafa.model.Tienda;
import G2.Estafa.model.Usuario;
//import G2.Estafa.model.Usuario;
import G2.Estafa.repository.TiendaRepository;
//import G2.Estafa.repository.UsuarioRepository;
@Service
public class TiendaService {
	@Autowired
	TiendaRepository tiendaRepository;
	
	public List<Tienda> getAll(){
		return tiendaRepository.findAll();
	}
	
	public void save(Tienda u) {
		tiendaRepository.saveAndFlush(u);
	}

	public void delete(String nombre) {
		tiendaRepository.deleteById(nombre);
	}

	public Tienda getById(String nombre) {
		return tiendaRepository.getOne(nombre);
	}

	public void neg(String nombre) {
		 try {
		        Tienda tienda = tiendaRepository.getOne(nombre);
		        tienda.neg();
		        tiendaRepository.saveAndFlush(tienda);
		        }
		        catch(Exception e){

		        }
		
	}
	public void pos(String nombre) {
		 try {
		        Tienda tienda = tiendaRepository.getOne(nombre);
		        tienda.pos();
		        tiendaRepository.saveAndFlush(tienda);
		        }
		        catch(Exception e){

		        }
		
	}
	
	
	//public Tienda comprobar(String nick, String pas) {
      //  Tienda tienda = tiendaRepository.getOne(nick);
        //if (usuario.getPassword().equals(pas))
          //  return usuario;
       // return null;
   //}
	
}
