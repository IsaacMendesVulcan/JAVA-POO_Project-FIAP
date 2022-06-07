package br.com.fiap.poo3;

import java.util.ArrayList;

public class Dvd implements IProduct<Dvd> {

	private String title;
	private int lenght;
	private String category;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public void getReview() {
		System.out.println("Público médio");

	}

	@Override
	public String getSinopsis() {
		return "A história do homem aranha";

	}

	@Override
	public void getAgeRating() {
		System.out.println("LIVRE");

	}

	@Override
	public ArrayList<Dvd> getList() {
		return new ArrayList<Dvd>();
	}

	@Override
	public String toString() {
		return "Dvd [title=" + title + ", lenght=" + lenght + ", category=" + category + "]";
	}

}
