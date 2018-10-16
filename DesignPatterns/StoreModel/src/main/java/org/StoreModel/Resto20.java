package org.StoreModel;

public class Resto20 implements Resto{
private Resto chain;
	
	@Override
	public void setProssimoTaglio(Resto prossimoTaglio) {
		this.chain=prossimoTaglio;
	}

	@Override
	public void eroga(Contante cur) {
		if(cur.getQuantita() >= 20){
			int num = (int) (cur.getQuantita()/20);
			double resto = (cur.getQuantita() % 20);
			System.out.println(num+" banconote da 20€");
			if(resto !=0) this.chain.eroga(new Contante(resto));
		}else{
			this.chain.eroga(cur);
		}
	}
}