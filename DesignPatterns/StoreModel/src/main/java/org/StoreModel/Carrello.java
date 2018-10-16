package org.StoreModel;

import java.util.ArrayList;

public class Carrello {
	

	ArrayList<Prodotto> prodotti;
	private double totale;
	
	public Carrello() {
		prodotti=new ArrayList<>();
	}
	
	public void aggiungiProdottoAlCarrello(Prodotto p) {
		prodotti.add(p);
		totale=getTotale();		
	}
	
	double getTotale() {
		totale=0;
		for (Prodotto p: prodotti) {
			totale+=p.prezzo;
		}
		return totale;
	}

	public void svuotaCarrello() {
		prodotti.removeAll(prodotti);
		totale=getTotale();
	}
	
	@Override
	public String toString() {
		return "Carrello [Prodotti=" + prodotti.toString()+ ", Totale=" + totale + "]";
	}

	public void acquista() {
		
	}
}
