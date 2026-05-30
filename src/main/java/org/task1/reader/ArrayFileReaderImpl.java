package org.task1.reader;

import org.task1.exception.ArrayWrapperException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ArrayFileReaderImpl implements ArrayFileReader {
    @Override
    public List<String> read(String filePath) throws ArrayWrapperException {
        try {
            return Files.readAllLines(Paths.get(filePath));
        }  catch (IOException e){
            throw new ArrayWrapperException("Unable to read file: " + filePath, e);
        }
    }
}
