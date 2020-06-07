package G2.Estafa.model;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ModeradorTest {
	private Moderador moderador;

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
		assertTrue("El nombre no puede ser nulo", (moderador.getNombre()!=null));
	}


	@Test
	void testGetNacimiento() {
		assertTrue("Fecha incorrecta", (moderador.getNacimiento()!=null));
	}

	

	@Test
	void testGetApellidos() {
		assertTrue("El apellido no puede ser nulo", (moderador.getApellidos()!=null));
	}

	

	@Test
	void testGetNick() {
		assertTrue("El nick no puede ser nulo", (moderador.getNick()!=null));
	}

	

	@Test
	void testGetEmail() {
		assertTrue("Email no valido", (moderador.getEmail()!=null));
	}

	

	@Test
	void testGetPassword() {
		assertTrue("Contraseña no valida", (moderador.getPassword()!=null));
	}

	

	

	@Test
	void testGetValoracion() {
		assertTrue("La valoracion no puede ser nula", (moderador.getValoracion()>=0||moderador.getValoracion()<=10));
	}

	

	
}