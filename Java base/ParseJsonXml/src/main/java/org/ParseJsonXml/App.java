package org.ParseJsonXml;

import java.io.IOException;
import java.net.URL;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.json.simple.parser.ParseException;
import org.xml.sax.SAXException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, ParserConfigurationException, SAXException, ParseException
    {
    	//PropertyConfigurator.configure("log4j.properties");
    	BasicConfigurator.configure();
		final org.apache.log4j.Logger logger = Logger.getLogger(App.class);
		
    	logger.debug("");
		logger.debug("*ESERCIZIO PARSING JSON-XML*");
		URL JSONurl = new URL("http://mysafeinfo.com/api/data?list=englishmonarchs&format=json");
		//URL XMLurl = new URL ("http://totheriver.com/learn/xml/code/employees.xml");
		Fetch JSONdataRetrieve = new Fetch (JSONurl);
		//Fetch XMLdataRetrieve = new Fetch (XMLurl);
		Parser parserJSON =new JSONParse (JSONdataRetrieve.getRetrievedDataString());
		//Parser parserXML = new XMLParse(XMLdataRetrieve.getRetrievedDataString());;
		parserJSON.doParsing();
		//parserXML.doParsing();
    }
}
