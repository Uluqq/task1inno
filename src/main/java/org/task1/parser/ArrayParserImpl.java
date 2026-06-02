package org.task1.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.task1.validator.ArrayValidator;

public class ArrayParserImpl implements ArrayParser{
    private final ArrayValidator validator;

    public ArrayParserImpl(ArrayValidator validator) {
        this.validator = validator;
    }
    private static final Logger logger = LogManager.getLogger(ArrayParserImpl.class);
    @Override
    public int[] parse(String line) {
        if (line == null || line.trim().isEmpty()) {
            logger.warn("Line skipped: string is null or empty");
            return new int[0];
        }
        logger.info("Attempting to parse line: {}", line);
        String[] elements = line.split(",");
        int[] tempArray = new int[elements.length];
        int validCount = 0;
        for (String element : elements){
            if (validator.isValid(element)){
                tempArray[validCount] = Integer.parseInt(element.trim());
                validCount++;
            }
        }
        if (validCount == 0) {
            logger.warn("Line skipped: no valid numbers found");
            return new int[0];
        }
        int [] validArray = new int[validCount];
        for (int i = 0; i < validCount; i++) {
            validArray[i] = tempArray[i];
        }
        logger.info("Successfully parsed line into array of size: {}", validArray.length);
        return validArray;
    }
}
