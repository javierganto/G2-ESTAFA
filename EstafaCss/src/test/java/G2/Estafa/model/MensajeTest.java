package G2.Estafa.model;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MensajeTest {
	private Mensaje mensaje;
	private Usuario usuario;
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
	void testGetTitulo() {
		String titulo = "El cristianismo";
		mensaje.setTitulo(titulo);
		assertEquals("El titulo es "+titulo,mensaje.getTitulo(),titulo);
	}

	@Test
	void testGetContenido() {
		String contenido = "Hola me llamo carlos";
		mensaje.setContenido(contenido);
		assertEquals("El contenido es "+contenido,mensaje.getContenido(),contenido);
	}

	
	@Test
	void testIsValidez() {
		int validez = 1;
		mensaje.setValidez(validez);
		assertEquals("La validez es "+validez, mensaje.getValidez(),validez);
	}

}
