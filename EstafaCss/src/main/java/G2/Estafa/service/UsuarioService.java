package G2.Estafa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import G2.Estafa.model.Usuario;
import G2.Estafa.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	
	UsuarioRepository usuarioRepository;
	
	public List<Usuario> getAll(){
		return usuarioRepository.findAll();
	}
	
	public void save(Usuario u) {
		usuarioRepository.saveAndFlush(u);
	}

	public void delete(String nick) {
		usuarioRepository.deleteById(nick);
	}

	public Usuario getById(String nick) {
		return usuarioRepository.getOne(nick);
	}
	
	
	public Usuario comprobar(String nick, String pas) {
		try {
			Usuario usuario = usuarioRepository.getOne(nick);
	        if (usuario.getPassword().equals(pas))
	            return usuario;
		}
        catch (Exception e) {
            
        }
		return null;
   }
	public void denuncia(String nick){
        try {
        Usuario usuario = usuarioRepository.getOne(nick);
        usuario.denunciar();
        usuarioRepository.saveAndFlush(usuario);
        }
        catch(Exception e){

        }
    }
	
	
}
