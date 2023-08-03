package interfaces;

public class Avion implements PuedeVolar{

	int numeroPasajeros;

	public Avion(int numeroPasajeros) {
		super();
		this.numeroPasajeros = numeroPasajeros;
	}

	@Override
	public int volar(int impulso) {
		System.out.println("El avion puede volar con un impulso de " + impulso);
		return 15;
	}
	
	
	
	
}
