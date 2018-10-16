package org.StoreModel;

public class ProdottoFactory {
	
	protected int codiceProdotto;
	double prezzo;
	String nome;
	
	
	
	public static Prodotto getProdotto(ProdottoAbstractFactory factory){
		return factory.createProdotto();
	}
}
