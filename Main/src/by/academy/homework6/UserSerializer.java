package by.academy.homework6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserSerializer {

	private static final int USER_COUNT = 10;
	private static final String DIRECTORY_PATH = "src/by.academy.homework6/io3/";
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
				ObjectOutputStream oos = new ObjectOutputStream(fos))
			{
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
