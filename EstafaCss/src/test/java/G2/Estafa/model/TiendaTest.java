package G2.Estafa.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TiendaTest {
	private Tienda tienda;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@Test
	void testGetNombre() {
		String nombre = "Amazon";
		tienda.setNombre(nombre);
		assertEquals("El nombre es "+nombre, tienda.getNombre(),nombre);
	}

	@Test
	void testGetValoracion() {
		int valoracion = 9;
		tienda.setValoracion(valoracion);
		assertEquals("La valoracion es "+valoracion,tienda.getValoracion(),valoracion);
	}

	@Test
	void testGetDireccion() {
		String direccion = "Las Rozas, Madrid";
		tienda.setDireccion(direccion);
		assertEquals("La direccion es "+direccion,tienda.getDireccion(),direccion);
	}

	@Test
	void testGetPaginaWeb() {
		String web = "amazon.es";
		tienda.setPaginaWeb(web);
		assertEquals("La pagina web es "+web,tienda.getPaginaWeb(),web);
	}

	@Test
	void testGetTipo_Producto() {
		String producto = "electronica";
		tienda.setTipo_Producto(producto);
		assertEquals("El tipo de producto es "+producto,tienda.getTipo_Producto(),producto);
	}

	@Test
	void testGetContacto() {
		String contacto = "amazon@amazon.es";
		tienda.setContacto(contacto);
		assertEquals("El contacto es "+contacto,tienda.getContacto(),contacto);
	}

}
