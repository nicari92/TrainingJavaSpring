import java.io.*;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;

import java.util.ArrayList;


public class ListOfNumbers {
	
    private List<Integer> list;
    private static final int SIZE = 10;
    
    //PropertyConfigurator.configure("log4j.properties");
	static Logger logger = Logger.getLogger(ListOfNumbers.class);

    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++)
            list.add(new Integer(i));
    }
    
    public void writeList() {
        PrintWriter out = null;

        try {
        	logger.debug("Entering try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));
        
            for (int i = 0; i < SIZE; i++)
                out.println("Value at: " + i + " = " + list.get(i));
        } catch (IndexOutOfBoundsException e) {
        	logger.error("Caught IndexOutOfBoundsException: " +
                                 e.getMessage());
        } catch (IOException e) {
        	logger.error("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
            	logger.debug("Closing PrintWriter");
                out.close();
            } else {
            	logger.debug("PrintWriter not open");
            }
        }
    }
    
    public void readList(File file) {
    	Scanner reader;
    	int i=0;
    	try {
    		reader = new Scanner(file);
    		while (reader.hasNext()){
    			list.add(reader.nextInt());
    		}
    		logger.debug(i);
    	} catch (FileNotFoundException e1) {
    		logger.error("File: " + file.getName() + " not found.");
    	}	   
    }
   
   public static void cat(File file) throws IOException {
	    RandomAccessFile input = null;
	    String line = null;

	    try {
	        input = new RandomAccessFile(file, "r");
	        while ((line = input.readLine()) != null) {
	        	logger.debug(line);
	        }
	        return;
	    } catch(FileNotFoundException fnf) {
	    	logger.error("File: " + file.getName() + " not found.");
	    } catch(IOException e) {
	    	logger.error(e.toString());
	    } finally {
	        if (input != null) {
	            try {
	                input.close();
	            } catch(IOException io) {
	            	
	            }
	        }
	    }
	}
}