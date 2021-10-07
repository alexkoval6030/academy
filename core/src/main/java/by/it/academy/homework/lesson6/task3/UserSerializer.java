package by.it.academy.homework.lesson6.task3;

import by.it.academy.homework.lesson6.FileAssistant;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserSerializer {

    private static final int USER_COUNT = 10;
    private static final String DIRECTORY_PATH = "java/by/it/academy/homework/lesson6/io3/";
    private static final String FILE_EXTENSION = ".txt";

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < USER_COUNT; i++) {
            User user = new User("firstName" + i, "lastName" + i, 20 + random.nextInt(10));
            users.add(user);
            File userFile = FileAssistant.addFail(DIRECTORY_PATH,
                    user.getFirstName() + "_" + user.getLastName() + FILE_EXTENSION);

            try (OutputStream fos = new FileOutputStream(userFile);
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(user);
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("IO exception occurred while processing file");
                e.printStackTrace();
            }
        }
    }
}
