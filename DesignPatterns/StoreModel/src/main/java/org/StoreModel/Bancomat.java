package org.StoreModel;

public class Bancomat extends Tessera{
	
	int codicePin;

	public Bancomat(String nome, String cognome, int numeroBancomat, int pin) {
		super (nome, cognome, numeroBancomat);
		this.codicePin=pin;
	}
	
	public int getPin() {
		return codicePin;
	}

}
