package org.StoreModel;

public class Cliente{
	private Carrello carrello;
	private CartaFedelta cartaFedelta;
	String nome;
	String cognome;

	public Cliente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		cartaFedelta=new CartaFedelta(nome, cognome);
		setCarrello(new Carrello());
	}

	public CartaFedelta getTessera() {
		return cartaFedelta;
	}

	public void setTessera(CartaFedelta cartaFedelta) {
		this.cartaFedelta = cartaFedelta;
	}
	
	public Carrello getCarrello() {
		return carrello;
	}
	public void setCarrello(Carrello carrello) {
		this.carrello = carrello;
	}
}
