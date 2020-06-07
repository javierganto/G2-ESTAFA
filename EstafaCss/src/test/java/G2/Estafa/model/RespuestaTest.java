package G2.Estafa.model;



import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RespuestaTest {
	private Respuesta respuesta;
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
	void testRespuesta() {
		assertTrue("La respuesta no puede ser vacia", (respuesta!=null));
	}

	@Test
	void testGetContenido() {
		assertTrue("Contenido debe ser mayor a 1 caracter", (respuesta.getContenido().length()>1));
	}

	@Test
	void testGetAutor() {
		assertTrue("Debe haber un nombre de autor", (respuesta.getAutor()!=null));
	}

	@Test
	void testIsValidez() {
		assertTrue("La respuesta es valida", respuesta.isValidez()>=0);
	}

}