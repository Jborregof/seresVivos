package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Gato;
import operations.OperacionesGato;

class OperacionesGatoTest {
	
	Gato g1 = new Gato();

	@Test
	void test() {
		OperacionesGato.cumpleAnos(g1);
		int esperado = 1;
		assertEquals(esperado,g1.getEdad());
	}

}
