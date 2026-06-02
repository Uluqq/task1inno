package by.papkovich.task1.reader;

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
    public List<String> read(String filePath) throws ArrayWrapperException {
        logger.info("Attempting to read file: {}", filePath);
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            logger.info("Successfully read {} lines", lines.size());
            return lines;
        } catch (IOException e) {
            logger.error("Failed to read file: {}", filePath, e);
            throw new ArrayWrapperException("Unable to read file: " + filePath, e);
        }
    }
}
