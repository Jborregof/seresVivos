package model;

public class Gato {
	
	private String nombre;
	private String id;
	private int edad;
	private char genero;
	
	public Gato() {
		nombre = "";
		id = "";
		edad = 0;
		genero = 'M';	
	}

	public Gato(String nombre, String id, int edad, char genero) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	@Override
	public boolean equals(Object obj) {
		boolean b = false;
		try {
			Gato h = (Gato) obj;
			b = (id.equals(h.id));
		} catch (ClassCastException ex) {
			
		}
		return b;
	}
	
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
	
}
