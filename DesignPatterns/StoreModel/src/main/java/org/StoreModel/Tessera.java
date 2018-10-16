package org.StoreModel;

public abstract class Tessera {
	
	int numeroTessera;
	String nomeIntestatario;
	String cosngomeIntestatario;
	
	public Tessera(String nome, String cognome, int n) {
		this.nomeIntestatario=nome;
		this.cosngomeIntestatario=cognome;
		this.numeroTessera=n;
	}

	public Object getNTessera() {
		return numeroTessera;
	}
}	
