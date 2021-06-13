package org.codecraftlabs.tools;

import javax.annotation.Nonnull;
import java.util.Optional;

public class StringUtil {
    public static boolean hasText(String value) {
        return value != null && !value.isEmpty();
    }

    public static boolean hasText(@Nonnull Optional<String> value) {
        if (value.isEmpty()) {
            return false;
        }
        return hasText(value.get());
    }
}
