package by.academy.homework6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OverwriteFile {

	private final String inputFullFilePath = "src/by.academy.homework6/io2/text.txt";
	private final String outputFilePath = "src/by.academy.homework6/io2/";
	private final String outputFileName = "result.txt";

	public static void main(String[] args) {

		new OverwriteFile().OverWriteFile();

	}

	private void OverWriteFile() {
		File inputFile = new File(inputFullFilePath);
		File outputFile = FileAssistant.addFail(outputFilePath, outputFileName);

		try (InputStream fis = new FileInputStream(inputFile);
			OutputStream fos = new FileOutputStream(outputFile))
		{
			while (true) {
				int read = fis.read();
				if (read == -1) {
					break;
				}
				if (read != ' ') {
					fos.write(read);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO exception occurred while processing file");
			e.printStackTrace();
		}
	}

}
