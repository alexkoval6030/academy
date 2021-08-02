package by.academy.classwork.deal;

import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {
	private static Pattern americanNumber = Pattern.compile("\\+1\\\\d{10}");

	@Override
	public boolean validate(String string) {
		if (americanNumber.matcher(string).matches()) {
			return true;
		}
		return false;
	}
}
