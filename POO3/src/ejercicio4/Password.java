package ejercicio4;

import java.util.Random;

public class Password {
	private static final int LENGTH_PASSWORD_DEFAULT = 8;
	private static final String CARACTERES = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789";
	
	private int longitud;
	private String password;
	
	public Password() {
		super();
		this.longitud = LENGTH_PASSWORD_DEFAULT;
		//this.password = generarPassword();
	}
	
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.password = generarPassword();
	}

	
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPassword() {
		return password;
	}

	public String generarPassword() {
		String pass = "";
		Random random = new Random();
		
		for(int i=1; i<=longitud;i++) {
			int pos = random.nextInt(CARACTERES.length());
			pass += CARACTERES.charAt(pos);
		}
		
		return pass;
	}
	
	public boolean esFuerte() {
		if (password.length() < 11) {
			return false;
		} else {
			int minus = 0;
			int mayus = 0;
			int nums = 0;
			for(int i=0;i<password.length(); i++) {
				char c = password.charAt(i);
				if (Character.isDigit(c)) {
					nums++;
				} else if (Character.isLowerCase(c)) {
					minus++;
				} else {
					mayus++;
				}
			}
			return minus>1 && mayus>2 && nums > 5;
		}		
	}
	
}
