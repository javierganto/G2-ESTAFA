package G2.Estafa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import G2.Estafa.model.Tienda;
//import G2.Estafa.model.Usuario;
import G2.Estafa.repository.TiendaRepository;
//import G2.Estafa.repository.UsuarioRepository;

public class TiendaService {
	@Autowired
	TiendaRepository tiendaRepository;
	
	public List<Tienda> getAll(){
		return tiendaRepository.findAll();
	}
	
	public void save(Tienda u) {
		tiendaRepository.saveAndFlush(u);
	}

	public void delete(String nick) {
		tiendaRepository.deleteById(nick);
	}

	public Tienda getById(String nick) {
		return tiendaRepository.getOne(nick);
	}
	
	
	//public Tienda comprobar(String nick, String pas) {
      //  Tienda tienda = tiendaRepository.getOne(nick);
        //if (usuario.getPassword().equals(pas))
          //  return usuario;
       // return null;
   //}
	
}
