package org.StringInversion;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;

public class Main 
{
    public static void main( String[] args )
    {
    	//PropertyConfigurator.configure("log4j.properties");
    	BasicConfigurator.configure();
		Logger logger = Logger.getLogger(Main.class);
		logger.debug("*ESERCIZIO INTERFACES: INVERSIONE STRINGHE*");
		Chars s = new Chars ("Suppose that you have written a time server, which periodically notifies");
		logger.debug("Stringa oiriginale: Suppose that you have written a time server, which periodically notifies");
		logger.debug("Test toString : "+s.toString());
		logger.debug("Carattere alla posizione 10: "+s.charAt(10));
		logger.debug("Lunghezza striga: "+s.length());
		logger.debug("Sottosequenza da 5 a 17: "+s.subSequence(5, 17));
    }
}
