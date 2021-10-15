package by.it.academy.classwork.lesson14;

import java.io.File;
import java.io.IOException;

public class FileDemo {

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
