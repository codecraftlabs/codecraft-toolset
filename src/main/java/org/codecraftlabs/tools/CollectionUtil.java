package org.codecraftlabs.tools;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.Map;

public class CollectionUtil {
    public static boolean isNullOrEmpty(@CheckForNull Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean containsItems(@Nonnull Collection<?> collection) {
        return !isNullOrEmpty(collection);
    }

    public static boolean isNullOrEmpty(@CheckForNull Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public static boolean containsItems(@CheckForNull Map<?, ?> map) {
        return !isNullOrEmpty(map);
    }
}
