package G2.Estafa.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;

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
		String nombre = "Alejandro";
		usuario.setNombre(nombre);
		assertEquals("El nombre es "+nombre, usuario.getNombre(),nombre);
	}


	@Test
	void testGetNacimiento() {
		Date nacimiento = new Date(12,04,2000);
		usuario.setNacimiento(nacimiento);
		assertEquals("La fecha de nacimiento es "+nacimiento,usuario.getNacimiento(),nacimiento);
	}

	

	@Test
	void testGetApellidos() {
		String apellidos = "Mozo";
		usuario.setApellidos(apellidos);
		assertEquals("El apellido es "+apellidos,usuario.getApellidos(),apellidos);
	}

	

	@Test
	void testGetNick() {
		String nick = "amozo-uma";
		usuario.setNick(nick);
		assertEquals("El nick es "+nick,usuario.getNick(),nick);
	}

	

	@Test
	void testGetEmail() {
		String email = "amozo@gmail.com";
		usuario.setEmail(email);
		assertEquals("El email es "+email,usuario.getEmail(),email);
	}

	

	@Test
	void testGetPassword() {
		String contraseña = "vivamitrabajo";
		usuario.setPassword(contraseña);
		assertEquals("La contraseña es "+contraseña,usuario.getPassword(),contraseña);
	}

	

	

	@Test
	void testGetValoracion() {
		int valoracion = 6;
		usuario.setValoracion(valoracion);
		assertEquals("La valoracion es "+valoracion,usuario.getValoracion(),valoracion);
	}

	

	
}