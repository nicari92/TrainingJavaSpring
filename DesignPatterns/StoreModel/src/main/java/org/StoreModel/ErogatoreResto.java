package org.StoreModel;

public class ErogatoreResto {

	private Resto r1;
	
	public ErogatoreResto() {
		this.r1 = new Resto200();
		Resto r2 = new Resto100();
		Resto r3 = new Resto50();
		Resto r4 = new Resto20();
		Resto r5 = new Resto10();
		Resto r6 = new Resto5();
		
		r1.setProssimoTaglio(r2);
		r2.setProssimoTaglio(r3);
		r3.setProssimoTaglio(r4);
		r4.setProssimoTaglio(r5);
		r5.setProssimoTaglio(r6);

	}

	public Resto getR1() {
		return r1;
	}
}