package org.codecraftlabs.tools;

import javax.annotation.CheckForNull;

import static java.lang.Character.isDigit;

public final class StringUtil {
    public static boolean hasText(@CheckForNull String value) {
        return value != null && !value.isEmpty();
    }

    public static boolean isEmptyOrNull(@CheckForNull String value) {
        return !hasText(value);
    }

    public static boolean containsSpace(@CheckForNull String value) {
        if (isEmptyOrNull(value)) {
            return false;
        }
        return value.contains(" ");
    }

    public static boolean containsOnlyNumbers(@CheckForNull String value) {
        if (isEmptyOrNull(value)) {
            return false;
        }

        var foundNonDigit = false;
        for (char aChar : value.toCharArray()) {
            if (!isDigit(aChar)) {
                foundNonDigit = true;
                break;
            }
        }
        return !foundNonDigit;
    }

    public static boolean containsOnlyLetters(@CheckForNull String value) {
        if (isEmptyOrNull(value)) {
            return false;
        }

        var foundDigit = false;
        for (char aChar : value.toCharArray()) {
            if (isDigit(aChar)) {
                foundDigit = true;
                break;
            }
        }
        return !foundDigit;
    }
}
