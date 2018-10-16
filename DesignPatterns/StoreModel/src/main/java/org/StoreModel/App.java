package org.StoreModel;

public class App {
    public static void main( String[] args ){
    	
        TessereFedelta catalogoTessere=TessereFedelta.getInstance();
        Magazzino magazzino=Magazzino.getInstance();
        Cassa cassa1=new Cassa();
        Banca banca1=new Banca("Unipol");        
        Tessera bancomatC1=new Bancomat("Mario", "Rossi", 123456789, 12345);        
        banca1.aggiungiCartaConDisponibilita(bancomatC1, 300);        
        POS pos1=new POS (banca1);
        
        Prodotto maglietta1 = ProdottoFactory.getProdotto(new MagliettaFactory(1, 10.00, "Red t-shirt", "rosso", "S"));
        Prodotto maglietta2 = ProdottoFactory.getProdotto(new MagliettaFactory(1, 15.00, "Blue t-shirt", "blu", "M"));       
        magazzino.aggiungiProdottoACatalogo(maglietta1);
        magazzino.aggiungiProdottoACatalogo(maglietta2);
        
        Cliente cliente1=new Cliente ("Mario", "Rossi");
        System.out.println("Punti cliente1: "+cliente1.getTessera().getPunti());
        
        cliente1.getCarrello().aggiungiProdottoAlCarrello(maglietta1);
        cliente1.getCarrello().aggiungiProdottoAlCarrello(maglietta2);
        System.out.println("Carrello cliente1: "+cliente1.getCarrello().toString());
        
        //cassa1.acquisto(cliente1, new PagamentoConCarta(pos1, bancomatC1, 12345));
          cassa1.acquisto(cliente1, new PagamentoContante(30));
        System.out.println("Punti cliente1: "+cliente1.getTessera().getPunti());
        
        System.out.println("Carrello cliente1: "+cliente1.getCarrello().toString());
        
        cliente1.getCarrello().aggiungiProdottoAlCarrello(maglietta1);
        System.out.println("Carrello cliente1: "+cliente1.getCarrello().toString());
    
    }
}
