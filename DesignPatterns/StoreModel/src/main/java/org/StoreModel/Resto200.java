package org.StoreModel;

public class Resto200 implements Resto{
private Resto chain;
	
	@Override
	public void setProssimoTaglio(Resto prossimoTaglio) {
		this.chain=prossimoTaglio;
	}

	@Override
	public void eroga(Contante cur) {
		if(cur.getQuantita() >= 200){
			int num = (int) (cur.getQuantita()/200);
			double resto = (cur.getQuantita() % 200);
			System.out.println(num+" banconote da 200€");
			if(resto !=0) this.chain.eroga(new Contante(resto));
		}else{
			this.chain.eroga(cur);
		}
	}
}
