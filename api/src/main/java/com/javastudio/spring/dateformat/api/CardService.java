package com.javastudio.spring.dateformat.api;

import com.javastudio.spring.dateformat.dto.CardDto;

import java.util.List;

public interface CardService {

    CardDto saveCard(CardDto card);

    List<CardDto> findAll();

}
