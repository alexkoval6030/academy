package by.it.academy.homework.lesson6.task4;

import by.it.academy.homework.lesson6.FileAssistant;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Random;

public class Task4 {
    private static final int FILE_COUNT = 100;
    private static final String DIRECTORY_PATH = "io/lesson6/task4/";
    private static final String RESULT_FILE_NAME = "result.txt";
    private static final String FILE_EXTENSION = ".txt";
    private static final String INPUT_FILE_FULL_PATH = "io/lesson6/task2/text.txt";

    public static void main(String[] args) {
        String text = readText();
        if (text == null) {
            return;
        }
        Random random = new Random();
        File resultFile = FileAssistant.addFail(DIRECTORY_PATH, RESULT_FILE_NAME);
        try (FileOutputStream resultFileOutput = new FileOutputStream(resultFile)) {
            for (int i = 0; i < FILE_COUNT; i++) {
                File file = FileAssistant.addFail(DIRECTORY_PATH, i + FILE_EXTENSION);
                int randomInt = random.nextInt(text.length());
                String substring = text.substring(0, randomInt);
                try (FileOutputStream fos = new FileOutputStream(file)) {
                    fos.write(substring.getBytes());
                    resultFileOutput.write((file.getName() + " " + file.length()).getBytes());
                    resultFileOutput.write('\n');
                } catch (Exception e) {
                    System.out.println("Exception occurred while writing file information");
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            System.out.println("Exception occurred while writing file");
            e.printStackTrace();
        }
    }

    private static String readText() {
        String text = null;
        try (BufferedReader bf = new BufferedReader(new FileReader(INPUT_FILE_FULL_PATH))) {
            text = bf.readLine();
            System.out.println("Text read");
        } catch (Exception e) {
            System.out.println("Exception occurred while processing text");
            e.printStackTrace();
        }
        return text;
    }
}