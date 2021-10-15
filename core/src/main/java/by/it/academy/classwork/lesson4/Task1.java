package by.it.academy.classwork.lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    //
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("c*a*b");
        Matcher matcher = pattern.matcher("cccab");
        boolean b = matcher.matches();
        System.out.println(b);

    }

}
