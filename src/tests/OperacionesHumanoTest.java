package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Humano;
import operations.OperacionesHumano;

class OperacionesHumanoTest {
	
	 Humano h1 = new Humano();

	@Test
	void test() {
		OperacionesHumano.cumpleAños(h1);
		int esperado = 1;
		assertEquals(esperado,h1.getEdad());
	}

}
