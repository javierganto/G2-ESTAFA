package G2.Estafa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Respuesta{
	@Id
	@GeneratedValue
	private String autor;
	private String contenido;
	private int validez;
	private double valoracion;
	
	@ManyToOne
	private Mensaje mensaje;
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public String getAutor() {
		return autor;
	}
	public int isValidez() {
		return validez;
	}
	public void setValidez(int validez) {
		this.validez = validez;
	}
	public double getValoracion() {
		return valoracion;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((contenido == null) ? 0 : contenido.hashCode());
		result = prime * result + ((mensaje == null) ? 0 : mensaje.hashCode());
		result = prime * result + validez;
		long temp;
		temp = Double.doubleToLongBits(valoracion);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Respuesta other = (Respuesta) obj;
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
		if (mensaje == null) {
			if (other.mensaje != null)
				return false;
		} else if (!mensaje.equals(other.mensaje))
			return false;
		if (validez != other.validez)
			return false;
		if (Double.doubleToLongBits(valoracion) != Double.doubleToLongBits(other.valoracion))
			return false;
		return true;
	}
	
}
