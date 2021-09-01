package by.academy.homework6;

import java.io.File;
import java.io.IOException;

public class FileAssistant {

	public static File addFail(String filePath, String fileName) {
		
		File folder = new File(filePath);
		boolean mkdirsSuccess = folder.mkdirs();
		
		if (mkdirsSuccess) {
			System.out.println("Folder created");
		}

		File file = new File(folder, fileName);
		
		try {
			boolean mkFileSuccess = file.createNewFile();
			if (mkFileSuccess) {
				System.out.println("File created");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return file;
	}
}
