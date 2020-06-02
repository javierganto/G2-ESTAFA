package G2.Estafa.service;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import G2.Estafa.model.Moderador;
import G2.Estafa.repository.ModeradorRepository;

@Service
public class ModeradorService {
	@Autowired
	ModeradorRepository moderadorRepository;
	
	public List<Moderador> getAll(){
		return moderadorRepository.findAll();
	}
	
	public void save(Moderador m) {
		moderadorRepository.saveAndFlush(m);
	}

	public void delete(String nick) {
		moderadorRepository.deleteById(nick);
	}

	public Moderador getById(String nick) {
		return moderadorRepository.getOne(nick);
	}
	
	
	public Moderador comprobar(String nick, String pas) {
        Moderador moderador = moderadorRepository.getOne(nick);
        if (moderador.getPassword().equals(pas))
            return moderador;
        return null;
   }

}
