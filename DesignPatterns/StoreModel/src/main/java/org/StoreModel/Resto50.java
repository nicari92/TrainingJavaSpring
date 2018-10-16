package org.StoreModel;

public class Resto50 implements Resto{
private Resto chain;
	
	@Override
	public void setProssimoTaglio(Resto prossimoTaglio) {
		this.chain=prossimoTaglio;
	}

	@Override
	public void eroga(Contante cur) {
		if(cur.getQuantita() >= 50){
			int num = (int) (cur.getQuantita()/50);
			double resto = (cur.getQuantita() % 50);
			System.out.println(num+" banconote da 50€");
			if(resto !=0) this.chain.eroga(new Contante(resto));
		}else{
			this.chain.eroga(cur);
		}
	}
}