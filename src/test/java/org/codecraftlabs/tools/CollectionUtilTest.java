package org.codecraftlabs.tools;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

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
        var emptyCollection = new ArrayList<>();
        assertThat(isNullOrEmpty(emptyCollection), is(true));
    }
}
