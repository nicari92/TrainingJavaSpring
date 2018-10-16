package org.StoreModel;

public class Resto10 implements Resto{
private Resto chain;
	
	@Override
	public void setProssimoTaglio(Resto prossimoTaglio) {
		this.chain=prossimoTaglio;
	}

	@Override
	public void eroga(Contante cur) {
		if(cur.getQuantita() >= 10){
			int num = (int) (cur.getQuantita()/10);
			double resto = (cur.getQuantita() % 10);
			System.out.println(num+"banconote da 10€");
			if(resto !=0) this.chain.eroga(new Contante(resto));
		}else{
			this.chain.eroga(cur);
		}
	}
}
