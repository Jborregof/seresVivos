package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Gato;
import operations.OperacionesGato;
import operations.OperacionesHumano;

class OperacionesGatoTest {
	
	Gato g1 = new Gato();

	@Test
	void test() {
		OperacionesGato.cumpleAños(g1);
		int esperado = 1;
		assertEquals(esperado,g1.getEdad());
	}

}
