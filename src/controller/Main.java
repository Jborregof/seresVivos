package controller;

import model.*;
import operations.*;

public class Main {

	public static void main(String[] args) {
		Humano h1 = new Humano("Joaquin","Borrego","Fernandez",25,"29505325M",'M');
		System.out.println(h1);
		OperacionesHumano.cumpleAnos(h1);
		System.out.println(h1);
		
		Gato g1 = new Gato("Neni","1234",8,'F');
		System.out.println(g1);
		OperacionesGato.cumpleAnos(g1);
		System.out.println(g1);
	}

}
