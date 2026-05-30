package org.task1.validator;

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
