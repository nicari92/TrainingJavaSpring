package org.StoreModel;

public class PagamentoConCarta implements Pagamento{
	Tessera tessera;
	int PINinserito;
	POS pos;
	
	public PagamentoConCarta(POS p, Tessera t, int PIN) {
		pos=p;
		tessera=t;
		PINinserito=PIN;
	}

	@Override
	public boolean paga(double daPagare) {
		pos.setTessera(tessera);
		if (pos.controlloPIN(PINinserito)) {
			if (pos.inviaRichiestaDiPagamento(daPagare, tessera.numeroTessera)){
				System.out.println("Pagamento riuscito");
				return true;
			} else {
				System.out.println("Pagamento NON riuscito.");
				return false;
			}
		} else {
			System.out.println("PIN errato");
			return false;
		}
	}
}
