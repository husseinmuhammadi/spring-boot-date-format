package com.javastudio.spring.dateformat.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class CardDto {
    private String cardNo;
    private LocalDateTime expirationDate;
}
