package org.StoreModel;

public class Resto100 implements Resto{
private Resto chain;
	
	@Override
	public void setProssimoTaglio(Resto prossimoTaglio) {
		this.chain=prossimoTaglio;
	}

	@Override
	public void eroga(Contante cur) {
		if(cur.getQuantita() >= 100){
			int num = (int) (cur.getQuantita()/100);
			double resto = (cur.getQuantita() % 100);
			System.out.println(num+" banconote da 100€");
			if(resto !=0) this.chain.eroga(new Contante(resto));
		}else{
			this.chain.eroga(cur);
		}
	}
}
