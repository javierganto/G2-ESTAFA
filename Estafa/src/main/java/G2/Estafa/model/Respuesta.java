package G2.Estafa.model;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Respuesta extends Mensaje{
	@Id
	private String autor;
	private String contenido;
	private boolean validez;
	private double valoracion;
	
	@OneToMany(mappedBy = "respuesta")
	List<Mensaje> respuestaMensajes;
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public String getAutor() {
		return autor;
	}
	public boolean isValidez() {
		return validez;
	}
	public void setValidez(boolean validez) {
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
		result = prime * result + (validez ? 1231 : 1237);
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
		if (validez != other.validez)
			return false;
		if (Double.doubleToLongBits(valoracion) != Double.doubleToLongBits(other.valoracion))
			return false;
		return true;
	}
	
}
