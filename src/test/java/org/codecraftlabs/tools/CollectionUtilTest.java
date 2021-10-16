package org.codecraftlabs.tools;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static java.util.Collections.EMPTY_LIST;
import static java.util.Collections.EMPTY_MAP;
import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;
import static org.codecraftlabs.tools.CollectionUtil.containsItems;
import static org.codecraftlabs.tools.CollectionUtil.isNullOrEmpty;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CollectionUtilTest {

    @Test
    public void isNullCollectionOk() {
        Collection<String> nullCollection = null;
        assertThat(isNullOrEmpty(nullCollection), is(true));
    }

    @Test
    public void isEmptyCollectionOk() {
        assertThat(isNullOrEmpty(emptyList()), is(true));
    }

    @Test
    public void isNullMapOk() {
        Map<String, String> nullMap = null;
        assertThat(isNullOrEmpty(nullMap), is(true));
    }

    @Test
    public void isEmptyMapOk() {
        assertThat(isNullOrEmpty(EMPTY_MAP), is(true));
    }

    @Test
    public void collectionContainsItemsOk() {
        List<String> items = Collections.singletonList("test");
        assertThat(containsItems(items), is(true));
    }

    @Test
    public void collectionContainsItemsFalse() {
        assertThat(containsItems(EMPTY_LIST), is(false));
    }

    @Test
    public void mapContainsItemsOk() {
        Map<String, String> items = Map.of("test", "test");
        assertThat(containsItems(items), is(true));
    }

    @Test
    public void mapContainsItemsFalse() {
        assertThat(containsItems(EMPTY_MAP), is(false));
    }
}
