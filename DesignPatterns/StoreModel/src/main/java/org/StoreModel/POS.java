package org.StoreModel;

public class POS {
	Tessera tessera;
	Banca banca;
	Bancomat tesseraBancomat;
	CartaDiCredito cartaDiCredito;
	
	public POS (Banca b) {
		this.banca=b;
	}

	public void setTessera(Tessera t) {
		if (t instanceof Bancomat) {
			tesseraBancomat=(Bancomat) t;
			
		} else if (t instanceof CartaDiCredito) {
			cartaDiCredito=(CartaDiCredito) t;
		}
	}
	
	public boolean controlloPIN(int PINinserito) {
		return (PINinserito==tesseraBancomat.getPin());
	}

	public boolean inviaRichiestaDiPagamento(double daPagare, int numeroDiTessera) {
		return banca.richiestaDiPagamento(daPagare, numeroDiTessera);
	}
}
