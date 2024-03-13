package org.minhhieu.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class Mappers {
    private static ObjectMapper objectMapper;

    private Mappers() {
        throw new UnsupportedOperationException();
    }

    private static void init() {
        objectMapper = new ObjectMapper()
                .setSerializationInclusion(JsonInclude.Include.NON_EMPTY)
                .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                .registerModule(new JavaTimeModule());
    }

    public static ObjectMapper get() {
        if (objectMapper == null) {
            init();
        }
        return objectMapper;
    }
}
