package br.com.fiap.poo3;

import java.util.ArrayList;

public class PlatformMock {

	public static ArrayList<Platform> getPlatforms() {

		ArrayList<Platform> lista = new ArrayList<Platform>();

		for (int j = 0; j <= 5; j++) {

			Platform p = new Platform();

			if (j % 2 == 0) {
				p.setFactory("Nintendo");
				p.setCountry("JP");
			} else {
				p.setFactory("Microsoft");
				p.setCountry("US");
			}

			lista.add(p);

		}
		return lista;

	}

}
