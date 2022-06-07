package br.com.fiap.poo3;

import java.util.ArrayList;

public class Game implements IProduct<Game> {

	private String title;
	private String category;
	private String ageRate;
	private ArrayList<Platform> platformList = new ArrayList<Platform>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAgeRate() {
		return ageRate;
	}

	public void setAgeRate(String ageRate) {
		this.ageRate = ageRate;
	}

	public ArrayList<Platform> getPlatformList() {
		return platformList;
	}

	public void setPlatformList(ArrayList<Platform> platformList) {
		this.platformList = platformList;
	}

	@Override
	public void getReview() {
		System.out.println("Aclamado pelo público");

	}

	@Override
	public String getSinopsis() {
		return "A história segue a busca do civil Ethan Winters por sua esposa Mia, que o leva a uma mansão"
				+ " agrícola aparentemente abandonada e habitada pela família Baker. Ethan faz uso de armas e ferramentas na "
				+ "luta contra os membros da família e os \"Mofados\", uma forma humanoide de bactéria.";
	}

	@Override
	public void getAgeRating() {
		System.out.println("+17");

	}

	public Game() {
		this.platformList = PlatformMock.getPlatforms();

	}

	@Override
	public ArrayList<Game> getList() {

		ArrayList<Game> listaGames = new ArrayList<Game>();
		for (int j = 0; j <= 10; j++) {			
			Game g = new Game();
			g.setAgeRate("LIVRE");
			g.setCategory("Categoria " + j );
			g.setTitle("Jogo " + j );
			listaGames.add(g);

		}
		return listaGames;
	}

	@Override
	public String toString() {
		return "Game [title=" + title + ", category=" + category + ", ageRate=" + ageRate + ", platformList="
				+ platformList + "]";
	}

}
