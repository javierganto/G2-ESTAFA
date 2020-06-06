package G2.Estafa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Mensaje {
	@Id
	@GeneratedValue
	private int id;
	private String titulo;
	private String contenido;
	private String autor;
	private boolean validez;
	
	@ManyToOne
	private Usuario usuario;
	
	@ManyToOne
	private Tienda tienda;
	
	@ManyToOne
	private Moderador moderador;
	
	
	public Mensaje() {
		
	}
	//StructuredExpression imagen;
	
	public String getContenido() {
		return contenido;
	}
	public String getAutor() {
		return autor;
	}
	
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public boolean isValidez() {
		return validez;
	}
	public void setValidez(boolean validez) {
		this.validez = validez;
	}
	
	
	@Override
	public String toString() {
		return "Mensaje [ contenido=" + contenido + ", autor=" + autor + ", validez=" + validez
				+ "]";
	}
	public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Tienda getTienda() {
        return tienda;
    }
    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }
    public Moderador getModerador() {
        return moderador;
    }
    public void setModerador(Moderador moderador) {
        this.moderador = moderador;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

	
}
