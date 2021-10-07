package by.it.academy.homework.lesson6.task1;

import by.it.academy.homework.lesson6.FileAssistant;

import java.io.*;
import java.util.Scanner;

public class StopFileWriter {

	private final String stopWord = "stop";
	private final String filePath = "java/by/it/academy/homework/lesson6/io1/";
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