package by.it.academy.homework.lesson5.task5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequentist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = scan.nextLine();
		String text1 = "What is Lorem Ipsum? Lorem Ipsum is simply dummy text of the printing and typesetting industry."
				+ " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown"
				+ " printer took a galley of type and scrambled it to make a type specimen book. It has survived not"
				+ " only five centuries, but also the leap into electronic typesetting, remaining essentially"
				+ " unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem"
				+ " Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including"
				+ " versions of Lorem Ipsum.";

        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (charMap.containsKey(text.charAt(i))) {
                charMap.replace(text.charAt(i), charMap.get(text.charAt(i)) + 1);
            } else {
                charMap.put(text.charAt(i), 1);
            }
        }
        Map<Character, Integer> charMap1 = new HashMap<>();
        for (int i = 0; i < text1.length(); i++) {
            if (charMap1.containsKey(text1.charAt(i))) {
                charMap1.replace(text1.charAt(i), charMap1.get(text1.charAt(i)) + 1);
            } else {
                charMap1.put(text1.charAt(i), 1);
            }
        }
        System.out.println(charMap);
        System.out.println(charMap1);
        scan.close();
    }
}