import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.apache.log4j.*;
public class ParseJSON {

	public static void main(String[] args) throws Exception{
		
		PropertyConfigurator.configure("log4j.properties");
		Logger logger = Logger.getLogger(ParseJSON.class);
		
		
		
		
		String inline = "";
	
		try	{
			//connessione all'url
			URL url = new URL("http://mysafeinfo.com/api/data?list=englishmonarchs&format=json");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int responsecode = conn.getResponseCode();
			logger.debug("Response code is: " +responsecode);
			//System.out.println("Response code is: " +responsecode);
			
			//controllo effettiva connessione
			if(responsecode != 200)
				throw new RuntimeException("HttpResponseCode: " +responsecode);
			else{
				//trascrizione contenuto url in una stringa
				Scanner sc = new Scanner(url.openStream());
				while(sc.hasNext())	{
					inline+=sc.nextLine();
				}
				logger.debug("Response code is: " +responsecode);
				//logger.debug(inline);
				sc.close();
			}
			//parse da stringa a array JSON (il fine JSON inizia con "[" )
			JSONParser parse = new JSONParser();
			JSONArray jarr = (JSONArray)parse.parse(inline);

			//conversione del contenuto array in oggetti JSON e stampa dei contenuti
			logger.debug("Stampa dei primi 2 oggetti nel JSON:");
			for(int i=0;i<2;i++)
			{
				JSONObject jobj = (JSONObject)jarr.get(i);
				logger.debug("\n");
				logger.debug("Nome: " +jobj.get("nm"));
				logger.debug("Città: " +jobj.get("cty"));
				logger.debug("Casa: " +jobj.get("hse"));
				logger.debug("Anni: " +jobj.get("yrs"));
			}
			
			//chiusura connessione
			conn.disconnect();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
			
}
