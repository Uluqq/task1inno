package by.papkovich.task1.reader.impl;

import by.papkovich.task1.reader.ArrayFileReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.papkovich.task1.exception.ArrayWrapperException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ArrayFileReaderImpl implements ArrayFileReader {

    private static final Logger logger = LogManager.getLogger(ArrayFileReaderImpl.class);

    @Override
    public List<String> readLinesFromFile(String filePath) throws ArrayWrapperException {
        logger.info("Attempting to readLinesFromFile file: {}", filePath);
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            logger.info("Successfully readLinesFromFile {} lines", lines.size());
            return lines;
        } catch (IOException e) {
            logger.error("Failed to readLinesFromFile file: {}", filePath, e);
            throw new ArrayWrapperException("Unable to readLinesFromFile file: " + filePath, e);
        }
    }
}
