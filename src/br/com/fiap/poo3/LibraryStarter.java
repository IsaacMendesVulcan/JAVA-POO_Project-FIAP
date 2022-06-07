package br.com.fiap.poo3;

import javax.swing.JOptionPane;

public class LibraryStarter {

	static IProduct _i;

	public static void main(String[] args) {
		Library l = new Library();
		String opt = JOptionPane
				.showInputDialog("Digite o tipo de prod que deseja consultar: G - Game / D - Dvd / L - Livro");
		if (opt.toUpperCase().equals("G")) {
			_i = new Game();
		  for (Object prod :_i.getList()) {
			  System.out.println(prod);
			  
		  }
			
		} else if (opt.toUpperCase().equals("L")) {
			_i = new Book();
		} else {
			_i = new Dvd();
		}
		l.searchProduct(_i);

	}

}
