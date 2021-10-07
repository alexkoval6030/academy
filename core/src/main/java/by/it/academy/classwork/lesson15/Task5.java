package by.it.academy.classwork.lesson15;

import java.util.function.Predicate;

public class Task5 {

    public static void main(String[] args) {
        Predicate<String> pred = s -> s.endsWith("A") && (s.startsWith("J") || s.startsWith("N"));
        String str = "JuniorA";
        System.out.println(pred.test(str));

    }

}
