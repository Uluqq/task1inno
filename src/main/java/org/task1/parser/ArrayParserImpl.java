package org.task1.parser;

import org.task1.validator.ArrayValidator;

public class ArrayParserImpl implements ArrayParser{
    private final ArrayValidator validator;

    public ArrayParserImpl(ArrayValidator validator) {
        this.validator = validator;
    }

    @Override
    public int[] parse(String line) {
        if (line == null || line.trim().isEmpty()) {
            return new int[0];
        }
        String[] elements = line.split(",");
        int[] tempArray = new int[elements.length];
        int validCount = 0;
        for (String element : elements){
            if (validator.isValid(element)){
                tempArray[validCount] = Integer.parseInt(element.trim());
                validCount++;
            }
        }
        int [] validArray = new int[validCount];
        for (int i = 0; i < validCount; i++) {
            validArray[i] = tempArray[i];
        }
        return validArray;
    }
}
