package by.it.academy.homework.lesson1.task1;

import java.util.Scanner;

public class Task1 {
    private static final double PURCHASE_AMOUNT_DISCOUNT_NUMBER_1 = 100;
    private static final double DISCOUNT_SIZE_NUMBER_1 = 0.95;
    private static final double PURCHASE_AMOUNT_DISCOUNT_NUMBER_2 = 200;
    private static final double DISCOUNT_SIZE_NUMBER_2 = 0.93;
    private static final double PURCHASE_AMOUNT_DISCOUNT_NUMBER_3 = 300;
    private static final double DISCOUNT_SIZE_NUMBER_3_MORE_THEN_18 = 0.84;
    private static final double DISCOUNT_SIZE_NUMBER_3_LESS_THEN_18 = 0.91;
    private static final double PURCHASE_AMOUNT_DISCOUNT_NUMBER_4 = 400;
    private static final double DISCOUNT_SIZE_NUMBER_4 = 0.85;
    private static final double DISCOUNT_SIZE_NUMBER_5 = 0.8;
    private static final int AGE_MAJORITY = 18;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the purchase amount");
        double i = scan.nextDouble();
        System.out.println("Enter the customer’s age");
        double j = scan.nextDouble();

        if (i < PURCHASE_AMOUNT_DISCOUNT_NUMBER_1) {
            i *= DISCOUNT_SIZE_NUMBER_1;
            System.out.println(i);
        } else if (i >= PURCHASE_AMOUNT_DISCOUNT_NUMBER_1 && i < PURCHASE_AMOUNT_DISCOUNT_NUMBER_2) {
            i *= DISCOUNT_SIZE_NUMBER_2;
            System.out.println(i);
        } else if (i >= PURCHASE_AMOUNT_DISCOUNT_NUMBER_2 && i < PURCHASE_AMOUNT_DISCOUNT_NUMBER_3) {
            if (j >= AGE_MAJORITY) {
                i *= DISCOUNT_SIZE_NUMBER_3_MORE_THEN_18;
            } else {
                i *= DISCOUNT_SIZE_NUMBER_3_LESS_THEN_18;
            }
            System.out.println(i);
        } else if (i >= PURCHASE_AMOUNT_DISCOUNT_NUMBER_3 && i < PURCHASE_AMOUNT_DISCOUNT_NUMBER_4) {
            i *= DISCOUNT_SIZE_NUMBER_4;
            System.out.println(i);
        } else {
            i *= DISCOUNT_SIZE_NUMBER_5;
            System.out.println(i);
        }
        scan.close();
    }
}