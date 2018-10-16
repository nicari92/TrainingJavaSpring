package org.StoreModel;

import java.util.HashMap;

public class Banca {
		String nomeBanca;
		
			 //<numeroCarta, disponibilità>
		HashMap<Integer, Double> carte;
		
		public Banca(String nome) {
			nomeBanca=nome;
			carte=new HashMap<>();
		}
		
		public void aggiungiCartaConDisponibilita(Tessera t, double disponibilita) {
			carte.put((Integer)t.getNTessera(), disponibilita);
		}
		public double getDisponibilità(Tessera t) {
			return carte.get(t.getNTessera());
		}

		public boolean richiestaDiPagamento(double daPagare, int numeroDiTessera) {
			if (carte.get(numeroDiTessera) != null)
				if (daPagare<=carte.get(numeroDiTessera)) {
					carte.put(numeroDiTessera, carte.get(numeroDiTessera)-daPagare);
					return true;
				} else {
					System.out.println("Fondi insufficienti");
					return false;	
				}
			else {
				System.out.println("Carta non trovata");
				return false;
			}
		}
		
}
