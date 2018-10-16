package org.StoreModel;

public class CartaFedelta{
	private String proprietario;
	private int nTessera;
	private int punti;
	
	
	public CartaFedelta (String nome, String cognome) {
		punti=10;
		proprietario=nome+" "+cognome;
		nTessera=TessereFedelta.nuovaCartaFedelta();
	}
	public String getProprietario() {
		return proprietario;
	}
	public int getnTessera() {
		return nTessera;
	}
	public int getPunti() {
		return punti;
	}
	public void setPunti(int punti) {
		this.punti = punti;
	}
}
