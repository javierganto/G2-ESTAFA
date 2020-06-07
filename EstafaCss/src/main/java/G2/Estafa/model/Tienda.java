package G2.Estafa.model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tienda {
 @Id 
private String nombre;
 
 
private int valoracion=0;
private String direccion;
private String paginaWeb;
private String tipo_Producto;
private String contacto;

@OneToMany (mappedBy = "tienda")
List<Mensaje> tiendamensajes;

      public Tienda() {
	
      }



public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getValoracion() {
	return valoracion;
}
public void setValoracion(int valoracion) {
	this.valoracion = valoracion;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getPaginaWeb() {
	return paginaWeb;
}
public void setPaginaWeb(String paginaWeb) {
	this.paginaWeb = paginaWeb;
}
public String getTipo_Producto() {
	return tipo_Producto;
}
public void setTipo_Producto(String tipo_Producto) {
	this.tipo_Producto = tipo_Producto;
}
public String getContacto() {
	return contacto;
}
public void setContacto(String contacto) {
	this.contacto = contacto;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((contacto == null) ? 0 : contacto.hashCode());
	result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
	result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
	result = prime * result + ((paginaWeb == null) ? 0 : paginaWeb.hashCode());
	result = prime * result + ((tipo_Producto == null) ? 0 : tipo_Producto.hashCode());
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
	Tienda other = (Tienda) obj;
	if (contacto == null) {
		if (other.contacto != null)
			return false;
	} else if (!contacto.equals(other.contacto))
		return false;
	if (direccion == null) {
		if (other.direccion != null)
			return false;
	} else if (!direccion.equals(other.direccion))
		return false;
	if (nombre == null) {
		if (other.nombre != null)
			return false;
	} else if (!nombre.equals(other.nombre))
		return false;
	if (paginaWeb == null) {
		if (other.paginaWeb != null)
			return false;
	} else if (!paginaWeb.equals(other.paginaWeb))
		return false;
	if (tipo_Producto == null) {
		if (other.tipo_Producto != null)
			return false;
	} else if (!tipo_Producto.equals(other.tipo_Producto))
		return false;
	if (Double.doubleToLongBits(valoracion) != Double.doubleToLongBits(other.valoracion))
		return false;
	return true;
	}
	@Override
	public String toString() {
		return nombre;
}



	public void neg() {
		valoracion--;
	}


	public void pos() {
		valoracion++;
	}


}
