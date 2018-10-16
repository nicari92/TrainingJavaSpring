package org.StoreModel;

public class PagamentoContante implements Pagamento{
	double contanti;
	
	public PagamentoContante(double cont) {
		this.contanti=cont;
	}

	@Override
	public boolean paga(double daPagare) {
		if (daPagare<=contanti) {;
			contanti-=daPagare;	
			ErogatoreResto erogatore = new ErogatoreResto();
			System.out.println("");
			System.out.println("Erogato "+contanti+"€ di resto come:");
			erogatore.getR1().eroga(new Contante(contanti));
			return true;
		} else {
			System.out.println("Disponibilità NON sufficienti. Pagamento NON effettuato");
			return false;
		}
		
	}
}
