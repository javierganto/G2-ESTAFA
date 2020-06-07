package G2.Estafa.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;

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
		String nombre = "Jesus";
		moderador.setNombre(nombre);
		assertEquals("El nombre es "+nombre, moderador.getNombre(),nombre);
	}


	@Test
	void testGetNacimiento() {
		Date nacimiento = new Date(25,12,0000);
		moderador.setNacimiento(nacimiento);
		assertEquals("La fecha de nacimiento es "+nacimiento,moderador.getNacimiento(),nacimiento);
	}

	

	@Test
	void testGetApellidos() {
		String apellidos = "De Nazaret";
		moderador.setApellidos(apellidos);
		assertEquals("El apellido es "+apellidos,moderador.getApellidos(),apellidos);
	}

	

	@Test
	void testGetNick() {
		String nick = "jesucristo0";
		moderador.setNick(nick);
		assertEquals("El nick es "+nick,moderador.getNick(),nick);
	}

	

	@Test
	void testGetEmail() {
		String email = "jesucristo@gmail.com";
		moderador.setEmail(email);
		assertEquals("El email es "+email,moderador.getEmail(),email);
	}

	

	@Test
	void testGetPassword() {
		String contraseña = "vivalostoros";
		moderador.setPassword(contraseña);
		assertEquals("La contraseña es "+contraseña,moderador.getPassword(),contraseña);
	}

	

	

	@Test
	void testGetValoracion() {
		int valoracion = 10;
		moderador.setValoracion(valoracion);
		assertEquals("La valoracion es "+valoracion,moderador.getValoracion(),valoracion);
	}

	

	
}