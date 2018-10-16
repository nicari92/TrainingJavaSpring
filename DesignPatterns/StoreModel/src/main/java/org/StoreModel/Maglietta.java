package org.StoreModel;

public class Maglietta extends Prodotto{
	
	public String colore;
	public String taglia;
	public String maniche;
	
	public Maglietta(int id, double p, String n, String c, String t, String maniche) {
		super(id, p, n);
		this.colore=c;
		this.taglia=t;
		this.maniche=maniche;
	}
}
