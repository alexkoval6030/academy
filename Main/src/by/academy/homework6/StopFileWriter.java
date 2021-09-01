package by.academy.homework6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class StopFileWriter {

	private final String stopWord = "stop";
	private final String filePath = "src/by.academy.homework6/io1/";
	private final String fileName = "hello.txt";

	public static void main(String[] args) {

		new StopFileWriter().writeFile();

	}

	private void writeFile() {
		File file = FileAssistant.addFail(filePath, fileName);
		Scanner scan = new Scanner(System.in);

		try (OutputStream fos = new FileOutputStream(file))
		{
			while (true) {
				System.out.println("Input text, input stop to finish");
				String input = scan.nextLine();

				if (input.trim().equalsIgnoreCase(stopWord)) {
					break;
				}

				fos.write(input.getBytes());
				fos.write('\n');
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO exception occurred while processing file");
			e.printStackTrace();
		}

		scan.close();
	}
}