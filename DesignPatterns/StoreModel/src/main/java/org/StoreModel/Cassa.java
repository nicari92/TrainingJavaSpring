package org.StoreModel;

public class Cassa extends CassaAstratta{
	public Cassa(){
		super.daPagare=0;
		sconto=0;
		resto=0;
		clienteInCassa=null;
		metodo=null;
		puntiMaturati=0;
	}	
	

	@Override
	protected int calcoloPuntiMaturati() {
		return (int)daPagare;
	};
}
