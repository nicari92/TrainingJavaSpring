package org.BasicIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class CharInFile {
	public static int countCharInFile(Path file, char character) {
		int c=0;
		if (Files.exists(file)&&Files.isReadable(file)) {
			Charset charset = Charset.forName("UTF-8");
			try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
				String line = null;
				while ((line = reader.readLine()) != null) {
					for (int i=0; i<line.length(); i++) {
						if (character==line.charAt(i)) c++;
					}
				}
			} catch (IOException x) {
				System.err.format("IOException: %s%n", x);
			}
		}
		return c;
	}
}
