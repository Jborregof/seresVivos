package model;

public class Humano {

	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;
	private String dni;
	private char genero;
	
	public Humano() {
			nombre = "";
			apellido1 = "";
			apellido2 = "";
			edad = 0;
			dni = "";
			genero = 'M';
			
	}
	
	public Humano(String nombre, String apellido1, String apellido2, int edad, String dni, char genero) {
		this();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
		this.dni = dni;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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
			Humano h = (Humano) obj;
			b = (dni.equals(h.dni));
		} catch (ClassCastException ex) {
			
		}
		return b;
	}

	@Override
	public String toString() {
		return "Humano [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad
				+ ", dni=" + dni + ", genero=" + genero + "]";
	}
	
	
	
	
	
}
