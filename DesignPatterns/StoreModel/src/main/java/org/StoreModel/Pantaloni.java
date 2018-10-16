package org.StoreModel;

public class Pantaloni extends Prodotto{
	public String colore;
	public String taglia;
	
	public Pantaloni(int id, double p, String n, String c, String t) {
		super(id, p, n);
		this.colore=c;
		this.taglia=t;
	}
}
