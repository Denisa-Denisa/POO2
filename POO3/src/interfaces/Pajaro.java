package interfaces;

public class Pajaro implements PuedeVolar{
	
	String nombre;
	

	public Pajaro(String nombre) {
		super();
		this.nombre = nombre;
	}


	@Override
	public int volar(int impulso) {
		System.out.println("El pajaro esta volando con un impulso de " + impulso);
		return 25;
	}
	
	
	
	
	
	
}
