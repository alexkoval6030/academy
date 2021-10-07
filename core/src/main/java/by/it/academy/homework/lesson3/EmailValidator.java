package by.it.academy.homework.lesson3;

import java.util.regex.Pattern;

public class EmailValidator implements Validator {

    private static Pattern EmailValidator = Pattern.compile("([0-9a-zA-Z-_]+@[\\w]*\\.ru|com|by)");

    @Override
    public boolean validate(String string) {
        if (EmailValidator.matcher(string).matches()) {
            return true;
        }
        return false;
    }
}
