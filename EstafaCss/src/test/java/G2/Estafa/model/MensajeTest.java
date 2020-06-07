package G2.Estafa.model;



import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MensajeTest {
	private Mensaje mensaje;
	private static final int TITULOMAX = 25;
	private static final int TITULOMIN = 1;
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
	void testMensaje() {
		assertTrue("El mensaje no puede ser vacio", (mensaje!=null));
	}

	@Test
	void testGetTitulo() {
		if(mensaje.getTitulo().length()>TITULOMAX||mensaje.getTitulo().length()<TITULOMIN) {
			System.out.println( "El titulo debe ser superior a "+TITULOMIN+ "o inferior a "+TITULOMAX);
		}
	}

	@Test
	void testGetContenido() {
		assertTrue("Contenido debe ser mayor a 1 caracter", (mensaje.getContenido().length()>1));
		}

	@Test
	void testGetAutor() {
		assertTrue("Debe haber un nombre de autor", (mensaje.getUsuario()!=null));
	}

	

	

	@Test
	void testIsValidez() {
		assertTrue("El mensaje es valido" ,mensaje.isValidez()==true);
	}

	


	

}
