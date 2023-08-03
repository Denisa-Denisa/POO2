package ejercicio3;

public class Ejercicio3 {
	/*
	 * Haz una clase llamada Persona que siga las siguientes condiciones: Sus
	 * atributos son: - nombre, - edad, - DNI, - sexo (H hombre, M mujer), - peso y
	 * - altura. No queremos que se accedan directamente a ellos. Piensa que
	 * modificador de acceso es el m�s adecuado, tambi�n su tipo. Si quieres a�adir
	 * alg�n atributo puedes hacerlo. Por defecto, todos los atributos menos el DNI
	 * ser�n valores por defecto seg�n su tipo (0 n�meros, cadena vac�a para String,
	 * etc.). Sexo ser� hombre por defecto, usa una constante para ello. Se
	 * implantar�n varios constructores: - Un constructor por defecto. - Un
	 * constructor con el nombre, edad y sexo, el resto por defecto. - Un
	 * constructor con todos los atributos como par�metro. Los m�todos que se
	 * implementar�n son: - CalcularIMC(): calculara si la persona est� en su peso
	 * ideal con la f�rmula: (peso en kg/(altura^2 en m)). - Si esta f�rmula
	 * devuelve un valor menor que 20, la funci�n devuelve un -1 y significa que
	 * est� por debajo de su peso ideal. - Si devuelve un n�mero entre 20 y 25
	 * (incluidos), significa que est� en su peso ideal y la funci�n devuelve un 0.
	 * - Si devuelve un valor mayor que 25 significa que tiene sobrepeso, la funci�n
	 * devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
	 * - esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano. -
	 * comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si
	 * no es correcto, ser� H. No ser� visible al exterior. - toString(): devuelve
	 * toda la informaci�n del objeto. - generaDNI(): genera un n�mero aleatorio de
	 * 8 cifras, genera a partir de este su n�mero su letra correspondiente. - Este
	 * m�todo ser� invocado cuando se construya el objeto. - Puedes dividir el
	 * m�todo para que te sea m�s f�cil. - No ser� visible al exterior. - M�todos
	 * set de cada par�metro, excepto de DNI.
	 * 
	 * Ahora, crea una clase ejecutable que haga lo siguiente: - Pide por teclado el
	 * nombre, la edad, sexo, peso y altura. - Crea 3 objetos de la clase anterior,
	 * - el primer objeto obtendr� las anteriores variables pedidas por teclado, -
	 * el segundo objeto obtendr� todos los anteriores menos el peso y la altura y -
	 * el �ltimo por defecto, para este �ltimo utiliza los m�todos set para darle a
	 * los atributos un valor. - Para cada objeto, deber� comprobar si est� en su
	 * peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje. -
	 * Indicar para cada objeto si es mayor de edad. - Por �ltimo, mostrar la
	 * informaci�n de cada objeto. Puedes usar m�todos en la clase ejecutable, para
	 * que os sea m�s f�cil
	 */
	public static void main(String[] args) {
		String nombre = "Pepe Garcia";
		int edad = 34;
		String dni = "01234567K";
		char sexo = 'H';
		float peso = 78.4f;
		float altura = 1.5f;

		Persona p1 = new Persona(nombre, edad, dni, sexo, peso, altura);
		Persona p2 = new Persona(nombre, edad, sexo);
		Persona p3 = new Persona();
		p3.setNombre("Luis");
		p3.setEdad(23);
		p3.setPesoKg(90.5f);
		p3.setAlturaMetros(1.9f);
		p3.setSexo('M');

		int imc1 = p1.calcularIMC();
		escribirImc(imc1);
		int imc2 = p2.calcularIMC();
		escribirImc(imc2);
		int imc3 = p3.calcularIMC();
		escribirImc(imc3);

		escribirMayorEdad(p1);
		escribirMayorEdad(p2);
		escribirMayorEdad(p3);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

	public static void escribirImc(int imc) {
		switch (imc) {
		case Persona.POR_DEBAJO_PESO_IDEAL:
			System.out.println("Estas por debajo de tu peso ideal.");
			break;
		case Persona.PESO_IDEAL:
			System.out.println("Estas en tu peso ideal.");
			break;
		case Persona.SOBREPESO:
			System.out.println("Tienes sobrepeso.");
			break;
		}
	}

	public static void escribirMayorEdad(Persona p) {
		if (p.esMayorDeEdad()) {
			System.out.println("Eres mayor de edad.");
		}
	}
}
