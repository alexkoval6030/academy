package by.it.academy.homework.lesson3;

import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {

    private static Pattern belarusNumber = Pattern.compile("\\+375\\\\d{9}");

    @Override
    public boolean validate(String string) {
        if (belarusNumber.matcher(string).matches()) {
            return true;
        }
        return false;
    }
}
