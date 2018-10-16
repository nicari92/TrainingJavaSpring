package org.ParseJsonXml;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.xml.sax.SAXException;

public class JSONParse extends Parser{
	
	

	public JSONParse(String inLineData) {
		super(inLineData);
	}
	
	Logger logger = Logger.getLogger(JSONParse.class);	

	@Override
	protected void doParsing() throws ParserConfigurationException, SAXException, ParseException{
		JSONParser parsed = new JSONParser();
		JSONArray jarr = (JSONArray) parsed.parse(super.getToBeParsed());
		logger.debug("Parse JSON riuscito");
		List<King> kings = new ArrayList<>();
		for(int i=0;i<jarr.size();i++){
			JSONObject jobj = (JSONObject)jarr.get(i);
			kings.add(new King(jobj.get("nm"), jobj.get("cty"), jobj.get("hse"), jobj.get("yrs")));
		}
		logger.debug("Stampa oggetti JSON filtrati");
		kings.stream()	.filter(king -> king.getStartYear() < 1000)
		.map(King::getName)
		.forEach(System.out::println);
		
	}
	
}
