package org.codecraftlabs.tools;

public class StringUtil {
    public static boolean hasText(String value) {
        return value != null && !value.isEmpty();
    }

    public static boolean isEmptyOrNull(String value) {
        return !hasText(value);
    }
}
