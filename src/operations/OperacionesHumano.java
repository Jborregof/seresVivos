package operations;

import model.Humano;

public class OperacionesHumano {

	public static void saludar(Humano h1, Humano h2) {
		System.out.println(h1.getNombre() + "salud� a " + h2.getNombre());	
	}
	
	public static void cumpleA�os(Humano h1) {
		h1.setEdad(h1.getEdad() + 1);
	}
	
}
