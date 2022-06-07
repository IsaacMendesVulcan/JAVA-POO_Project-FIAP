package br.com.fiap.poo3;

import java.util.ArrayList;

public class Book implements IProduct<Book> {

	private String title;
	private int pageNum;
	private String category;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public void getReview() {
		System.out.println("Recorde de vendas");

	}

	@Override
	public String getSinopsis() {
		return "A história do Harry Potter";

	}

	@Override
	public void getAgeRating() {
		System.out.println("LIVRE");

	}

	@Override
	public ArrayList<Book> getList() {	
		return new ArrayList<Book>();
	}

}
