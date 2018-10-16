package org.BasicIO;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class App {
	
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		final org.apache.log4j.Logger logger = Logger.getLogger(App.class);
		
		logger.debug("*ESERCIZIO BasicIO*");
		char character='a';
		Path file=Paths.get("/home/nicari/Documents/xanadu.txt");
		int counts=CharInFile.countCharInFile(file, character);
		logger.debug("Ho trovato "+counts+" occorrenze del carattere '"+character+"' nel file "+file.toString());
	}

}