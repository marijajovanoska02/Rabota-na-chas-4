package zadacha3;

public class Proizvod {
	
	private String ime;
	private String proizvoditel;
	private int cena;
	private double tezhina;

	public Proizvod () {
		this.ime = "Sintagma";
		this.proizvoditel = "Vitaminka";
		this.cena = 48;
		this.tezhina = 100;
	}

	public String getIme () {
		return this.ime;
	}
	public String getProizvoditel () {
		return this.proizvoditel;
	}
	public int getCena () {
		return this.cena;
	}
	public double getTezhina () {
		return this.tezhina;
}
