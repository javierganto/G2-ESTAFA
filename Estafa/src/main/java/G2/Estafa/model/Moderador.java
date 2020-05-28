package G2.Estafa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Moderador extends Usuario{
	@OneToMany (mappedBy = "moderador")
	List<Mensaje> moderadormensajes;
	
}
