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
}
