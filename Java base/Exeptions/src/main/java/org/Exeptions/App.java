package org.Exeptions;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BasicConfigurator.configure();
    	Logger logger = Logger.getLogger(App.class);
    	logger.debug("*ESERCIZIO EXEPTIONS*");
    	logger.debug("Creazione di un file, lettura degli int nel file e aggiunta a un vettore");
    	ListOfNumbers List1= new ListOfNumbers();
    	List1.writeList();
    	List1.readList(System.getProperty("user.dir")+"/file.txt");
    }
}
