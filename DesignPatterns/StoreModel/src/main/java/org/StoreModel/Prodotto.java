package org.StoreModel;

public abstract class Prodotto {
	
	protected int codiceProdotto;
	double prezzo;
	String nome;

	
	public Prodotto(int codiceProdotto, double prezzo, String nome) {
		this.codiceProdotto = codiceProdotto;
		this.prezzo = prezzo;
		this.nome = nome;
	}
	public int getCodiceProdotto() {
		return codiceProdotto;
	}
	public void setCodiceProdotto(int codiceProdotto) {
		this.codiceProdotto = codiceProdotto;
	}
	@Override
	public String toString() {
		return "Prodotto [nome=" + nome + "]";
	}
}
