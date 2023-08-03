package ejercicio3;

import java.util.Random;

public class Persona {
	public static final char SEXO_POR_DEFECTO = 'H';
	public static final int SOBREPESO = 1;
	public static final int PESO_IDEAL = 0;
	public static final int POR_DEBAJO_PESO_IDEAL = -1;
	
	protected String nombre;
	protected int edad;
	protected String dni;
	protected char sexo;
	protected float pesoKg;
	protected float alturaMetros;
	
	public Persona() {
		super();
		nombre = "";
		edad = 0;
		dni = generaDni();
		sexo = SEXO_POR_DEFECTO;
		pesoKg = 0f;
		alturaMetros = 0f;
	}

	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo) ? sexo : SEXO_POR_DEFECTO;
		dni = generaDni();
		pesoKg = 0f;
		alturaMetros = 0f;
	}

	public Persona(String nombre, int edad, String dni, char sexo, 
					float pesoKg, float alturaMetros) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = comprobarSexo(sexo) ? sexo : SEXO_POR_DEFECTO;
		this.pesoKg = pesoKg;
		this.alturaMetros = alturaMetros;
	}
	
	public int calcularIMC() {
		double imc = pesoKg / Math.pow(alturaMetros, 2);
		if (imc < 20) {
			return POR_DEBAJO_PESO_IDEAL;
		} else if (imc>=20 && imc <=25) {
			return PESO_IDEAL;
		} else {
			return SOBREPESO;
		}
	}
	
	public boolean esMayorDeEdad() {
		return edad>=18;
	}
	
	private boolean comprobarSexo(char sexo) {
		return sexo == 'H' || sexo == 'M';
	}
	
	public String toString() {
		return "DNI: " + dni + 
				"\nNombre: " + nombre +
				"\nEdad: " + edad +
				"\nSexo: " + sexo +
				"\nPeso: " + pesoKg + " kg" +
				"\nAltura: " + alturaMetros + " m";
	}
	
	private String generaDni() {
		String num = generaNumero(8);
		return num + calcularLetraDni(Integer.valueOf(num));
	}

	private String generaNumero(int longitud) {
		String num = "";
		Random random = new Random();
		for(int i=1; i<=longitud; i++) {
			num += random.nextInt(9);
		}
		return num;
	}
	
	private char calcularLetraDni(int numeroDni) {
		final char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 
		                          'M', 'Y', 'F', 'P', 'D',
		                          'X', 'B', 'N', 'J', 'Z', 
		                          'S', 'Q', 'V', 'H', 'L',
		                          'C', 'K', 'E'};
		int resto = numeroDni % 23;
		return letrasDNI[resto];
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setPesoKg(float pesoKg) {
		this.pesoKg = pesoKg;
	}

	public void setAlturaMetros(float alturaMetros) {
		this.alturaMetros = alturaMetros;
	}
	
	
}
