package by.it.academy.homework.lesson6.task2;

import by.it.academy.homework.lesson6.FileAssistant;

import java.io.*;

public class OverwriteFile {
    private final String inputFullFilePath = "io/lesson6/task2/text.txt";
    private final String outputFilePath = "io/lesson6/task2/";
    private final String outputFileName = "result.txt";

    public static void main(String[] args) {
        new OverwriteFile().OverWriteFile();
    }

    private void OverWriteFile() {
        File inputFile = new File(inputFullFilePath);
        File outputFile = FileAssistant.addFail(outputFilePath, outputFileName);
        try (InputStream fis = new FileInputStream(inputFile);
             OutputStream fos = new FileOutputStream(outputFile)) {
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