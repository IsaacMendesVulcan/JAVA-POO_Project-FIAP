package br.com.fiap.poo3;

import java.util.ArrayList;

public interface IProduct<T> {	
	void getReview();
	String getSinopsis();
	void getAgeRating();	
	ArrayList<T> getList();

}
