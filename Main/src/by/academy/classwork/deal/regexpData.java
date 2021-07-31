package by.academy.classwork.deal;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexpData {
	private static Pattern patternData1 = Pattern.compile("\\d{1,2}\\/\\d{1,2}\\/\\d{4}");
	private static Pattern patternData2 = Pattern.compile("\\d{1,2}\\-\\d{1,2}\\-\\d{4}");
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter date in dd/MM/yyyy");
		String scanData1 = scan.nextLine();
		Matcher matcherData1 = patternData1.matcher(scanData1);
		
		if(matcherData1.matches()) {
			System.out.println("The date matches the pattern");
		}else {
			System.out.println("The date does not match the pattern");
		}
		
		System.out.println("Enter date in dd-MM-yyyy");
		String scanData2 = scan.nextLine();
		Matcher matcherData2 = patternData2.matcher(scanData2);
		
		if(matcherData2.matches()) {
			System.out.println("The date matches the pattern");
		}else {
			System.out.println("The date does not match the pattern");
		}
		
		scan.close();
	}
}
