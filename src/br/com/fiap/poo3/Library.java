package br.com.fiap.poo3;

public class Library {	

	private IProduct _product;
	
	public void searchProduct(IProduct product) {
		this._product = product;
		System.out.println(this._product.getSinopsis());
		
	}

}
