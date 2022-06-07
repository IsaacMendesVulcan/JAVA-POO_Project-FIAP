package br.com.fiap.poo3;

public class Platform {
	
	private String factory;
	private String country;
	
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Platform [factory=" + factory + ", country=" + country + "]";
	}	
	
	
}
