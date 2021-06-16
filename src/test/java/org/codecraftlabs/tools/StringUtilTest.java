package org.codecraftlabs.tools;

import org.junit.jupiter.api.Test;

import static org.codecraftlabs.tools.StringUtil.containsOnlyNumbers;
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

    @Test
    public void containsSpaceIsTrueWithStartSpace() {
        assertThat(containsSpace(" with"), is(true));
    }

    @Test
    public void containsSpaceIsTrueWithMiddleSpace() {
        assertThat(containsSpace("with more"), is(true));
    }

    @Test
    public void containsSpaceIsTrueWithEndSpace() {
        assertThat(containsSpace("with "), is(true));
    }

    @Test
    public void containsOnlyDigitsEmpty() {
        assertThat(containsOnlyNumbers(""), is(false));
    }

    @Test
    public void containsOnlyDigitsNull() {
        assertThat(containsOnlyNumbers(null), is(false));
    }

    @Test
    public void containsOnlyDigitsOk() {
        assertThat(containsOnlyNumbers("1234"), is(true));
    }

    @Test
    public void containsOnlyDigitsMixed() {
        assertThat(containsOnlyNumbers("1234a"), is(false));
    }
}
