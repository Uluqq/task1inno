package org.task1.reader;

import org.task1.exception.ArrayWrapperException;

import java.util.List;

public interface ArrayFileReader {
    List<String> read(String filePath) throws ArrayWrapperException;
}
