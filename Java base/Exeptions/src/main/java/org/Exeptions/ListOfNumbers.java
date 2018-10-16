package org.Exeptions;

import java.io.*;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Vector;
import org.apache.log4j.Logger;

import java.util.ArrayList;
 
public class ListOfNumbers {
	
	Logger logger = Logger.getLogger(ListOfNumbers.class);
	
    private List<Integer> list;
    private static final int SIZE = 10;
    Vector<Integer> vct = new Vector<>();
    
 
    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++)
            list.add(new Integer(i));
    }
    public void writeList() {
        PrintWriter out = null;
 
        try {
           //System.out.println("Entering try statement");
        	File file = new File(System.getProperty("user.dir")+"/file.txt");
            out = new PrintWriter(new FileWriter(file));
         
            for (int i = 0; i < SIZE; i++)
                out.println(i);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: " +
                                 e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }
    
    public void readList(String fileName) {
        File file = new File(fileName);
        
        try{
        	Scanner scanner = new Scanner(file);
        	int n=scanner.nextInt();
        	vct.addElement(n);
        	logger.debug("Aggiunta di "+n+" al vettore");
        	while(scanner.hasNextLine()) {
        			try{
        				n=scanner.nextInt();
        				vct.addElement(n);
                		logger.debug("Aggiunta di "+n+" al vettore");
        			} catch (NoSuchElementException e) {
        				logger.debug("Fine lettura del file");
        			}
        	}
        	scanner.close();
        } catch(FileNotFoundException e) {
        		logger.debug("File "+fileName+" non trovato");
        }
    }
}