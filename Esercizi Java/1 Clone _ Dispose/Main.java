import org.apache.log4j.Logger;
public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		/**
		* Log4j logger
		*/
		final Logger logger = Logger.getLogger(Main.class);
		
		OggettoA a1=new OggettoA(1);
		logger.debug("a1: "+a1.toString());
		
		logger.debug("copia oggetto a1...");
		OggettoA a2=(OggettoA) a1.clone();
		logger.debug("a2: "+a2.toString());
		logger.debug("Euquals di a1 e a2: "+a1.equals(a2));
		
		OggettoB b1=new OggettoB(2);
		logger.debug("b1: "+b1.toString());
		
		logger.debug("copia oggetto b1...");
		OggettoB b2=(OggettoB) b1.clone();
		logger.debug("b2: "+b2.toString());
		logger.debug("Euquals di b1 e b2: "+b1.equals(b2));
		
		try {
			b1.finalize();
			logger.debug("finalizing b1...");
			b2.finalize();
			logger.debug("finalizing b2...");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}