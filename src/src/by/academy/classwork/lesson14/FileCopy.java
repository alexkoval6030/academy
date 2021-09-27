package by.academy.classwork.lesson14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static final String INPUT_FILE_PATH = "src\\io\\file.txt";
	public static final String OUTPUT_FILE_PATH = "src\\io\\file.txt";

	public static void main(String[] args) throws IOException {
		File dir = new File("src/io/");

		if (!dir.exists()) {
			dir.mkdirs();
		}

		File inputFile = new File(INPUT_FILE_PATH);
		if (!inputFile.exists()) {
			inputFile.createNewFile();
		}

		File outputFile = new File(INPUT_FILE_PATH);
		if (!outputFile.exists()) {
			outputFile.createNewFile();
		}
		FileInputStream fileIn = new FileInputStream(inputFile);
		FileOutputStream fileOut = new FileOutputStream(inputFile);
		int a;
		while ((a = fileIn.read()) != -1) {
			fileOut.write(a);
			System.out.println((char) a);
			if ((char) a == ' ') {
				fileOut.write('_');
			} else {
				fileOut.write(a);
			}

		}
	}

}
