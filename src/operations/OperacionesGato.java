package operations;

import model.Gato;
import model.Humano;

public class OperacionesGato {
	
	public static void pedir(Gato g1, Humano h1) {
		System.out.println(g1.getNombre() + "dijo -Miau- a " + h1.getNombre());	
	}
	
	public static void cumpleAños(Gato g1) {
		g1.setEdad(g1.getEdad() + 1);
	}

}
