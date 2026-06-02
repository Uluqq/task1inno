package org.task1.validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayValidatorImplTest {

    private final ArrayValidator validator = new ArrayValidatorImpl();
    @Test
    public void isValidShouldReturnTrueForValidNumbers() {
        Assertions.assertTrue(validator.isValid("42"));
        Assertions.assertTrue(validator.isValid("-5"));
        Assertions.assertTrue(validator.isValid("0"));
    }
    @Test
    public void isValidShouldReturnFalseForInvalidStrings() {
        Assertions.assertFalse(validator.isValid("42a"));
        Assertions.assertFalse(validator.isValid("hello"));
        Assertions.assertFalse(validator.isValid("3.14"));
        Assertions.assertFalse(validator.isValid(""));
        Assertions.assertFalse(validator.isValid("   "));
        Assertions.assertFalse(validator.isValid(null));
    }
}