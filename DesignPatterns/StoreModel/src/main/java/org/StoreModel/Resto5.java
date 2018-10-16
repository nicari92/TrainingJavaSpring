package org.StoreModel;

public class Resto5 implements Resto{
	private Resto chain;
	
	@Override
	public void setProssimoTaglio(Resto prossimoTaglio) {
		this.chain=prossimoTaglio;
	}

	@Override
	public void eroga(Contante cur) {
		if(cur.getQuantita() >= 5){
			int num = (int) (cur.getQuantita()/5);
			double resto = (cur.getQuantita() % 5);
			System.out.println(num+" banconote da 5€");
			if(resto !=0) System.out.println("+ "+resto+"€ in moneta");;
		}else{
			this.chain.eroga(cur);
		}
	}
}
