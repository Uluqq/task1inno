package by.papkovich.task1.reader;

import by.papkovich.task1.exception.ArrayWrapperException;

import java.util.List;

public interface ArrayFileReader {
    List<String> read(String filePath) throws ArrayWrapperException;
}
