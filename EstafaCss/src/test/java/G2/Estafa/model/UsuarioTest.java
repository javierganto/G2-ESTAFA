package G2.Estafa.model;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
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
	void testGetNombre() {
		assertTrue("El nombre no puede ser nulo", (usuario.getNombre()!=null));
	}


	@Test
	void testGetNacimiento() {
		assertTrue("Fecha incorrecta", (usuario.getNacimiento()!=null));
	}

	

	@Test
	void testGetApellidos() {
		assertTrue("El apellido no puede ser nulo", (usuario.getApellidos()!=null));
	}

	

	@Test
	void testGetNick() {
		assertTrue("El nick no puede ser nulo", (usuario.getNick()!=null));
	}

	

	@Test
	void testGetEmail() {
		assertTrue("Email no valido", (usuario.getEmail()!=null));
	}

	

	@Test
	void testGetPassword() {
		assertTrue("Contraseña no valida", (usuario.getPassword()!=null));
	}

	

	

	@Test
	void testGetValoracion() {
		assertTrue("La valoracion no puede ser nula", (usuario.getValoracion()>=0));
	}

	

	
}