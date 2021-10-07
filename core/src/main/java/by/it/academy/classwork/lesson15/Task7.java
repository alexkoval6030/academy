package by.it.academy.classwork.lesson15;

import java.util.function.Function;

public class Task7 {

    public static void main(String[] args) {
        Function<Integer, Integer> function = b -> {
            if (b == 0) {
                System.out.println("Число равно 0");
                return b;
            } else if (b > 0) {
                System.out.println("Число положительное");
                return b;
            } else {
                System.out.println("Число отрицательное");
                return b;
            }
        };
        System.out.println(function.apply(-2));
    }
}
