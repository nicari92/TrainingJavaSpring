package org.StoreModel;

public class MagliettaFactory implements ProdottoAbstractFactory{
	
	public int id;
	public double p;
	public String nome;
	public String colore;
	public String taglia;
	public String maniche;
	
	
	public MagliettaFactory(int id, double pre, String nom, String col, String tag) {
		this.id=id;
		this.p=pre;
		this.nome=nom;
		this.colore=col;
		this.taglia=tag;
		//this.maniche=maniche;
	}
	
	@Override
	public Prodotto createProdotto() {
		return new Maglietta(id, p, colore, taglia, maniche, colore);
	}

}
