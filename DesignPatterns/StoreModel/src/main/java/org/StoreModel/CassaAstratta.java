package org.StoreModel;

public abstract class CassaAstratta {
	double daPagare;
	double sconto;
	double resto;
	Cliente clienteInCassa;
	Pagamento metodo;
	int puntiMaturati;
	
	public final void acquisto(Cliente cliente, Pagamento metodoDiPagamento) {
		clienteInCassa=cliente;
		metodo=metodoDiPagamento;
		
		calcoloPrezzo();
		puntiMaturati=calcoloPuntiMaturati();
		calcoloSconto();
		daPagare-=sconto;
		scaloPunti();
		if (scambioEconomico()) {
			aggiornamentoPunti(puntiMaturati);
			svuotamentoCarrello();
		} else System.out.println("Pagamento NON riuscito");
		
	}	
	protected void calcoloPrezzo() {
		int totale=0;
		for (Prodotto p: clienteInCassa.getCarrello().prodotti)
		totale+=p.prezzo;
		daPagare=totale;
		
		/*CalcolatorePrezzi caolcolatore = new CalcolatorePrezzi();
		int totale=0;
		for(Prodotto p : clienteInCassa.getCarrello().prodotti){
			totale+= item.accept(visitor);
		}*/
	}
	protected void calcoloSconto() {
		sconto=clienteInCassa.getTessera().getPunti()/10;
	};
	protected abstract int calcoloPuntiMaturati();
	protected void scaloPunti(){
		clienteInCassa.getTessera().setPunti(0);
	}
	protected void svuotamentoCarrello() {
		clienteInCassa.getCarrello().svuotaCarrello();
	};
	protected void aggiornamentoPunti(int punti) {
		clienteInCassa.getTessera().setPunti(punti);
	};
	protected boolean scambioEconomico() {
		return metodo.paga(daPagare);
	};
}
