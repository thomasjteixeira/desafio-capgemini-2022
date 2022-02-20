package com.github.thomasjteixeira;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q2Password {

    public static int minimumCharForPasswordToBeStrong(String s) {
        int minimumChar = 0;

        String specialCharactersPattern = "[^a-zA-Z0-9]";
        Pattern p = Pattern.compile(specialCharactersPattern);
        Matcher m = p.matcher(s);

        minimumChar+= s.chars().anyMatch(Character::isDigit) ? 0 : 1;

        minimumChar+= s.chars().anyMatch(Character::isLowerCase) ? 0 : 1;

        minimumChar+= s.chars().anyMatch(Character::isUpperCase) ? 0 : 1;

        minimumChar+= m.find() ? 0 : 1;

        int quantMinimumChar = Integer.max(minimumChar, 6 - s.length());

        return quantMinimumChar;
    }
}
