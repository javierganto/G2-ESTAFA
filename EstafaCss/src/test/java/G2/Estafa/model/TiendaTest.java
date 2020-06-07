package G2.Estafa.model;

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
	void testTienda() {
		assertTrue("La tienda no debe estar vacia", tienda!=null);
	}

	@Test
	void testGetNombre() {
		assertTrue("La tienda debe tener nombre", tienda.getNombre()!=null);
	}

	@Test
	void testGetValoracion() {
		assertTrue("La tienda tiene que tener una valoracion", tienda.getValoracion()>=0);
	}

	@Test
	void testGetDireccion() {
		assertTrue("La tienda tiene que tener una direccion", tienda.getDireccion()!=null);
	}

	@Test
	void testGetPaginaWeb() {
		assertTrue("La tienda debe tener pagina web", tienda.getPaginaWeb()!=null);
	}

	@Test
	void testGetTipo_Producto() {
		assertTrue("La tienda debe tener producto", tienda.getTipo_Producto()!=null);
	}

	@Test
	void testGetContacto() {
		assertTrue("La tienda tiene que tener un contacto", tienda.getContacto()!=null);
	}

}
