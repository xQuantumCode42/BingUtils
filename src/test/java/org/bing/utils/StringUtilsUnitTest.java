package org.bing.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsUnitTest {
    @BeforeEach
    void setUp() {
    }

    @Test
    void testReverse() {
        var result = StringUtils.reverse("abc");
        assertEquals("cba", result);
    }
}
