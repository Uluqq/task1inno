package org.task1.parser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.task1.validator.ArrayValidatorImpl;

public class ArrayParserImplTest {
    private final ArrayParser parser = new ArrayParserImpl(new ArrayValidatorImpl());
    @Test
    public void parseShouldExtractValidNumbersAndIgnoreGarbage() {
        int[] expected = {1, 3, 5};
        int[] actual = parser.parse("1, 2y, 3, 5, 7tt");
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void parseShouldReturnEmptyArrayForNullOrEmptyString() {
        Assertions.assertArrayEquals(new int[0], parser.parse(""));
        Assertions.assertArrayEquals(new int[0], parser.parse("   "));
        Assertions.assertArrayEquals(new int[0], parser.parse(null));
    }
    @Test
    public void parseShouldHandleStringWithOnlyGarbage() {
        int[] actual = parser.parse("a, b, c, 1.5, ++");
        Assertions.assertArrayEquals(new int[0], actual);
    }
}