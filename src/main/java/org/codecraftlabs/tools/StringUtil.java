package org.codecraftlabs.tools;

public class StringUtil {
    public static boolean hasText(String value) {
        return value != null && !value.isEmpty();
    }

    public static boolean isEmptyOrNull(String value) {
        return !hasText(value);
    }

    public static boolean containsSpace(String value) {
        if (isEmptyOrNull(value)) {
            return false;
        }

        return value.contains(" ");
    }

    public static boolean containsOnlyNumbers(String value) {
        if (isEmptyOrNull(value)) {
            return false;
        }

        boolean foundNonDigit = false;
        for (char aChar : value.toCharArray()) {
            if (! Character.isDigit(aChar)) {
                foundNonDigit = true;
                break;
            }
        }
        return !foundNonDigit;
    }

    public static boolean containsOnlyLetters(String value) {
        if (isEmptyOrNull(value)) {
            return false;
        }

        boolean foundDigit = false;
        for (char aChar : value.toCharArray()) {
            if (Character.isDigit(aChar)) {
                foundDigit = true;
                break;
            }
        }
        return !foundDigit;
    }
}
