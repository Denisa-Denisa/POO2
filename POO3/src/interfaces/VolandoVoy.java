package interfaces;

import java.util.ArrayList;
import java.util.List;

public class VolandoVoy {

	public static void main(String[] args) {

		List<PuedeVolar> voladores = new ArrayList<>();

		voladores.add(new Avion(2));
		voladores.add(new Pajaro("carpintero"));
		voladores.add(new Pajaro("perico"));
		voladores.add(new Avion(100));

		for (PuedeVolar v : voladores) {
			v.volar(4);

		}
	}

}
