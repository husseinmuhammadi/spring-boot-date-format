package com.javastudio.spring.dateformat.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.javastudio.spring.dateformat.web.generated.v1.model.Card;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.time.LocalDateTime;

class MockDataGenerator {

    private ObjectMapper mapper;

    @BeforeEach
    void setUp() {
        mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    @Test
    void generateData() throws Exception {
        Card card = new Card().cardNo("5522336655998844").expirationDate(LocalDateTime.now());

        try (BufferedWriter out = new BufferedWriter(new FileWriter(new File("create-card-request.json")))) {
            out.write(
                    mapper.writeValueAsString(card)
            );
        }
    }
}
