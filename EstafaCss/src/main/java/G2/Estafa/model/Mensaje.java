package G2.Estafa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;


@Entity

public class Mensaje {
	@Id
	@GeneratedValue
	private Integer id;
	private String titulo;
	private String contenido;
	
	private int validez = 0;
	
	@ManyToOne
	private Usuario usuario;
	
	@ManyToOne
	private Tienda tienda;
	
	
	
	
	public Mensaje() {
		
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	



	public String getContenido() {
		return contenido;
	}
	
	
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	
	
	@Override
	public String toString() {
		return "Mensaje [ titulo=" + titulo + ", contenido=" + contenido
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
   
    public int getValidez() {
		return validez;
	}



	public void setValidez(int validez) {
		this.validez = validez;
	}

    public void neg() {
		validez--;
	}


	public void pos() {
		validez++;
	}



	
	
}
