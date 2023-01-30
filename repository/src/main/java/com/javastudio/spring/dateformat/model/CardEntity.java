package com.javastudio.spring.dateformat.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Getter
@Setter
public class CardEntity {

    @Id
    private String id;

    private String cardNo;

    private LocalDateTime expirationDate;
}
