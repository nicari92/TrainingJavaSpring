package file_operations;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.log4j.Logger;

public class FileUsage {
	public static void main(String[] args) throws IOException {
		final Logger logger = Logger.getLogger(FileUsage.class);
		
		Path path = Paths.get("/home/nicari/eclipse-workspace/file_operations/file.txt");
		if (! Files.exists(path, new LinkOption[]{ LinkOption.NOFOLLOW_LINKS})) {
				//Path createdFilePath = Files.createFile(path);
				String str = "Nel mezzo del cammin di nostra vita";
				 try(java.io.BufferedWriter writer = java.nio.file.Files.newBufferedWriter(path, StandardCharsets.UTF_8))
				 {
					 writer.write(str);
				 }
				logger.debug("File creato in: "+path);
				logger.debug("Ho scritto:\n"+ new String(Files.readAllBytes(path)));
				
				//copia
				Path path2 = Paths.get("/home/nicari/eclipse-workspace/file_operations/file2.txt");
				Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING);
				logger.debug("Copia del fine nella destinazione: "+path2);
				logger.debug("Contenuto copiato : \n"+new String(Files.readAllBytes(path)));
			
		} else {
			logger.debug("File già esistente. Contenuto:");
			logger.debug(new String(Files.readAllBytes(path)));
			logger.debug("Aggiunta di una stringa al file");
			
		}
	}
}
