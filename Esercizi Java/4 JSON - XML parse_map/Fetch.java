import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Fetch {
	
	private URL url;
	private String retrievedDataString;
	private int responsecode;
	
	public Fetch(URL link) throws IOException {
		this.url = link;
		retrievedDataString=getData();
	}
	
	public String getData() throws IOException{
		Logger logger = Logger.getLogger(Fetch.class);
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		logger.debug("Apertura connession");
		conn.connect();
		responsecode = conn.getResponseCode();
		if(responsecode != 200) {
			throw new RuntimeException("HttpResponseCode: " +responsecode);
		}else {
			logger.debug("Connessione riuscita");
			String str="";
			Scanner scn = new Scanner(url.openStream());
			while(scn.hasNext())	{
				str+=scn.nextLine();
			}
			scn.close();
			logger.debug("Stringa ricevuta: "+str);
			return str;
		}
	}

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

	public String getRetrievedDataString() {
		return retrievedDataString;
	}

	public void setRetrievedDataString(String retrievedDataString) {
		this.retrievedDataString = retrievedDataString;
	}

	
	
}
