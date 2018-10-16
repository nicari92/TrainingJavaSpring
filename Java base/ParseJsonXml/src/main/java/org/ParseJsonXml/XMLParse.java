package org.ParseJsonXml;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XMLParse extends Parser{
	
	public XMLParse(String inLineData) {
		super(inLineData);
	}
	
	@Override
	public void doParsing() throws ParserConfigurationException, SAXException, IOException {
		
		
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = saxParserFactory.newSAXParser();
		MyHandlerXML handler = new MyHandlerXML();
		
		InputSource is = new InputSource(new StringReader(super.getToBeParsed()));
		
		saxParser.parse(is, handler);
		java.util.List<Employee> empList = handler.getEmpList();
		for(Employee emp : empList) {
			System.out.println(emp);
		}
	}
}
