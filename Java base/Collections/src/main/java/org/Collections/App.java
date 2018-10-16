package org.Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class App 
{
    public static void main( String[] args ){
    	
    	BasicConfigurator.configure();
		final Logger logger = Logger.getLogger(App.class);
		
		//Es 1: RandomArgsPrint
		logger.debug("*ESERCIZIO COLLECTIONS*");
		logger.debug("Esercizio 1: stampa argomenti in ordine casuale");
    	List<String> a=Arrays.asList("prima", "seconda", "terza", "quarta");
		Collections.shuffle(a);		
		logger.debug("Stampa degli argomenti del main usando uno stream:");
		a.stream()
		 .forEach(e->logger.debug(e));
		logger.debug("Stampa degli argomenti del main usando un for:");
		for (String e: a) {
            logger.debug(e);
        }
		
		logger.debug("");
		logger.debug("Esercizio 2: creazione di un TreeSet con un insensitive-case comparator");
		SortedSet<String> s1 = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        s1.add("caSa");
        logger.debug("aggiunta di \"caSa\"");
        s1.add("cane");
        logger.debug("aggiunta di \"cane\"");
        s1.add("cAsa");
        logger.debug("aggiunta di \"cAsa\"");
        
        logger.debug(s1.size() + " parole distinte in " + s1.toString());
        
    	
        //Es 2: ListTrim
        logger.debug("");
        logger.debug("Esercizio 3: implemetazione di un metodo che prende List<String> e applica String.trim a ogni elem.");
        List<String> l = Arrays.asList("   3 spazi prima", "2 spazi prima ", "1 spazio prima");
        logger.debug("Stringhe non trimmate: ");
        for (String s2 : l) {
            logger.debug(s2);
         }
        logger.debug("Stringhe trimmate: ");
        ListTrim.listTrim(l);
        for (String s2 : l) {
           logger.debug(s2);
        }
        
        
    }
}
