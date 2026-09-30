package com.attendance.storage;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class FileHandler {

    private final ObjectMapper mapper = new ObjectMapper();

    public void save(Object data, String filePath) throws IOException {
        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File(filePath), data);
    }

    public <T> T load(String filePath, Class<T> type) throws IOException {
        return mapper.readValue(new File(filePath), type);
    }
}

