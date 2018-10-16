package org.Generics;
import java.util.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class App {
    public static void main( String[] args )   {
    	
    	BasicConfigurator.configure();
		Logger logger = Logger.getLogger(App.class);
		
		logger.debug("*ESERCIZI GENERICS*");
		logger.debug("Esercizio 1: ");
		logger.debug("creazione di una collezione");
    	Collection<Integer> c1 = new ArrayList<>();
    	logger.debug("popolando la collezione di numeri interi da 0 a 9");
    	for (int i=0; i<10; i++) {
    		c1.add(i);
    	}
    	OddTest t=new OddTest();
        int count = Count.count(c1, t);
        logger.debug("utilizzo del metodo Count con proprietà Test (numeri dispari)");
        logger.debug("La lista contiene "+count+" numeri dispari");
        logger.debug("");
        
        logger.debug("Esercizio 2: scambio oggetti in un array");
        logger.debug("");
        Object [] objArr=new Object[3];
        for (int i=0; i<3; i++) {
    		objArr[i]=new Integer(i+1);
    		logger.debug("La posizione "+i+" dell' array di oggetti contiene: "+ objArr[i].toString());
    	}
        logger.debug("Utilizzo del metodo Swap sull'array nelle posizioni 0 e 1");
        Swap.swap(objArr, 0, 1);
        for (int i=0; i<3; i++) {
    		logger.debug("La posizione "+i+" dell' array di oggetti contiene: "+ objArr[i].toString());
    	}
        
    }
}
