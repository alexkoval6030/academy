package by.academy.classwork.lesson13;

import java.util.HashMap;
import java.util.Map;

public class LongestStringPrefixApp {

	public static void main(String[] args) {
		
		String[] array = { "test", "test", "tes", "abc", "cba", "abcde", "abcdef" };

		System.out.println(getLongestPrefix(array));

	}

	public static String getLongestPrefix(String[] array) {

		String longestPrefix = null;
		Map<String, Integer> prefixCounter = new HashMap<>();

		String largestString = null;

//		for (int i = 0; i < array.length; i++) {
//			String courent = array[i];
//
//			if (largestString == null) {
//				largestString = courent;
//				continue;
//			}
//		}

		System.out.println("Largest String: " + largestString);

		for (int i = 0; i < array.length; i++) {
			String temp = array[i];
			for (int j = 0; j < temp.length(); j++) {
				String s = temp.substring(0, j);
				prefixCounter.put(temp.substring(0, j), 1);
				if (prefixCounter.containsKey(s)) {
					prefixCounter.put(s, prefixCounter.get(s) + 1);
				} else {
					prefixCounter.put(temp.substring(0, j), 1);
				}
			}
		}
		System.out.println(prefixCounter);
		for (String s : prefixCounter.keySet()) {
			if (prefixCounter.get(s) < 2) {
				continue;
			}
			if (longestPrefix == null || s.length() > longestPrefix.length()) {
				longestPrefix = s;
			}
		}
		
		return longestPrefix;

	}

}
