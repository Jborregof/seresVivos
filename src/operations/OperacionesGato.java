package operations;

import model.Gato;
import model.Humano;

public class OperacionesGato {
	
	public static void pedir(Gato g1, Humano h1) {
		System.out.println(g1.getNombre() + "dijo -Miau- a " + h1.getNombre());	
	}
	
	public static void cumpleAnos(Gato g1) {
		g1.setEdad(g1.getEdad() + 1);
	}

	public static boolean esMacho(Gato g1) {
		return g1.getGenero() == 'M';
	}
}
