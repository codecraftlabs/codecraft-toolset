package org.codecraftlabs.tools;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.Map;

public class CollectionUtil {
    public static boolean isNullOrEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean containsItems(@Nonnull Collection<?> collection) {
        return !isNullOrEmpty(collection);
    }

    public static boolean isNullOrEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public boolean containsItems(Map<?, ?> map) {
        return !isNullOrEmpty(map);
    }
}
