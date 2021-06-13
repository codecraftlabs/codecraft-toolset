package org.codecraftlabs.tools;

import org.junit.jupiter.api.Test;

import static org.codecraftlabs.tools.StringUtil.containsSpace;
import static org.codecraftlabs.tools.StringUtil.hasText;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class StringUtilTest {

    @Test
    public void hasTextWithNull() {
        assertThat(hasText(null), is(false));
    }

    @Test
    public void hasTextWithEmpty() {
        assertThat(hasText(""), is(false));
    }

    @Test
    public void hasTextOk() {
        assertThat(hasText("Some"), is(true));
    }

    @Test
    public void containsSpaceReturnsFalseWithNull() {
        assertThat(containsSpace(null), is(false));
    }

    @Test
    public void containsSpaceReturnsFalseWithEmptyString() {
        assertThat(containsSpace(null), is(false));
    }

    @Test
    public void containsSpaceReturnsTrueWithSingleSpace() {
        assertThat(containsSpace(" "), is(true));
    }
}
