package org.StoreModel;

import java.util.HashSet;;

public class Magazzino {
	
	HashSet<Integer> catalogoProdotti;
	
	private static Magazzino instance;
    
	private Magazzino() {
		catalogoProdotti=new HashSet<Integer>();
	}
    
    public static Magazzino getInstance(){
        if(instance == null){
            instance = new Magazzino();
        }
        return instance;
    }
	
	
	public boolean aggiungiProdottoACatalogo(Prodotto prodotto) {
		if (catalogoProdotti.contains(prodotto.getCodiceProdotto())) {
			return false;
		} else catalogoProdotti.add(prodotto.getCodiceProdotto());
			return true;

	}	
}
