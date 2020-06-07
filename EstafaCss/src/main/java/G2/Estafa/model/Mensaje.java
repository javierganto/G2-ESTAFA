package G2.Estafa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Mensaje {
	@Id
	@GeneratedValue
	private int id;
	private String titulo;
	private String contenido;
	
	private boolean validez;
	
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



	public void setId(int id) {
		this.id = id;
	}



	public String getContenido() {
		return contenido;
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
		return "Mensaje [ contenido=" + contenido + ", validez=" + validez
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
   
    
   

	
}
