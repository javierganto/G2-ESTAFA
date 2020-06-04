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
	
	@OneToMany (mappedBy="mensaje")
	private List<Respuesta> respuestas;
	
	public Mensaje() {
		
	}
	//StructuredExpression imagen;
	public String getTitulo() {
		return titulo;
	}
	public String getContenido() {
		return contenido;
	}
	public String getAutor() {
		return autor;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((contenido == null) ? 0 : contenido.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + (validez ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mensaje other = (Mensaje) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (contenido == null) {
			if (other.contenido != null)
				return false;
		} else if (!contenido.equals(other.contenido))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (validez != other.validez)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Mensaje [titulo=" + titulo + ", contenido=" + contenido + ", autor=" + autor + ", validez=" + validez
				+ "]";
	}
	
	
}
