package by.papkovich.task1.validator.impl;

import by.papkovich.task1.validator.ArrayValidator;

public class ArrayValidatorImpl implements ArrayValidator {
    public static final String REGEX_VALID_NUMBER = "^-?\\d+$";

    @Override
    public boolean isValid(String element) {
        if (element == null || element.trim().isEmpty()) {
            return false;
        }
        return element.trim().matches(REGEX_VALID_NUMBER);
    }
}
