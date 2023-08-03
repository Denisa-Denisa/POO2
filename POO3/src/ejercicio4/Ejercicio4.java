package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Haz una clase llamada Password que siga las siguientes condiciones: - Que
	 * tenga los atributos � longitud y � contrase�a. Por defecto, la longitud ser�
	 * de 8. - Los constructores ser�n los siguiente: � Un constructor por defecto.
	 * � Un constructor con la longitud que nosotros le pasemos. Generar� una
	 * contrase�a aleatoria con esa longitud. - Los m�todos que implementa ser�n: �
	 * esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe
	 * tener m�s de 2 may�sculas, m�s de 1 min�scula y m�s de 5 n�meros. �
	 * generarPassword(): genera la contrase�a del objeto con la longitud que tenga.
	 * � M�todo get para contrase�a y longitud. � M�todo set para longitud.
	 * 
	 * Ahora, crea una clase ejecutable: - Crea un array de Passwords con el tama�o
	 * que t� le indiques por teclado. - Crea un bucle que cree un objeto para cada
	 * posici�n del array. - Indica tambi�n por teclado la longitud de los Passwords
	 * (antes de bucle). - Crea otro array de booleanos donde se almacene si el
	 * password del array de Password es o no fuerte (usa el bucle anterior). Al
	 * final, muestra la contrase�a y si es o no fuerte (usa el bucle anterior). Usa
	 * este simple formato: contrase�a1 valor_booleano1 contrase�a2 valor_booleano2
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cuantas contraseñas deseas generar? ");
		int cantidadPass = sc.nextInt();

		Password[] passwords = new Password[cantidadPass];
		boolean[] passwordsFuerte = new boolean[cantidadPass];

		System.out.print("Que longitud deseas para las contraseñas? ");
		int longitudPass = sc.nextInt();

		for (int i = 0; i < passwords.length; i++) {
			passwords[i] = new Password(longitudPass);
			passwordsFuerte[i] = passwords[i].esFuerte();
			System.out.printf("%s %b\n", passwords[i].getPassword(), passwordsFuerte[i]);
		}
		sc.close();

	}

}
