import java.net.URL;

import org.apache.log4j.*;
public class Es {

	public static void main(String[] args) throws Exception{
		
		PropertyConfigurator.configure("log4j.properties");
	
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