package by.academy.classwork.lesson14;

import java.io.File;
import java.io.IOException;

public class FileDemo {
//	1.Создать через относительный путь папку io (src\\io)
//  2.Создать 2 файла:
//	a)file.txt
//	b)user.txt
//3.

	public static void main(String[] args) throws IOException {
		File file = new File("src\\io");

		if (!file.exists()) {
			file.mkdir();
		}

		File fileTxt = new File("src\\io\\text.txt");
		if (!fileTxt.exists()) {
			file.createNewFile();
		}

		File userTxt = new File("src\\io\\user.txt");
		if (!userTxt.exists()) {
			file.createNewFile();
		}
	}

}
