package org.ParseJsonXml;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public abstract class Parser {
	
	String toBeParsed;
	
	public Parser(String retirevedData) {
		this.setToBeParsed(retirevedData);
	}

	protected abstract void doParsing() throws ParserConfigurationException, SAXException, org.json.simple.parser.ParseException, IOException;

	public String getToBeParsed() {
		return toBeParsed;
	}

	public void setToBeParsed(String data) {
		this.toBeParsed= data;
	}

}
