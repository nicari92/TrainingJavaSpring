package org.Annotations;

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
		final org.apache.log4j.Logger logger = Logger.getLogger(App.class);
		logger.debug("*ESERCIZIO ANNOTATIONS*");
		logger.debug("Corpo dell'interfaccia richiesta: ");
		logger.debug("");
		logger.debug("public @interface EnhancementRequest {");
		logger.debug("\t int id();");
		logger.debug("\t String synopsis();");
		logger.debug("\t String engineer() default \"[unassigned]\";");
		logger.debug("\t String date() default \"[unknown]\";");
		logger.debug("}");
    }
}
