package com.javastudio.spring.dateformat.web.resources;

import com.javastudio.spring.dateformat.api.CardService;
import com.javastudio.spring.dateformat.web.generated.v1.api.CardsApi;
import com.javastudio.spring.dateformat.web.generated.v1.model.Card;
import com.javastudio.spring.dateformat.web.mapper.CardModelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class CardsResource implements CardsApi {

    private final CardService service;
    private final CardModelMapper mapper;

    @Override
    public ResponseEntity<Void> createNewCard(Card card) {
        Card savedCard = mapper.map(service.saveCard(mapper.map(card)));
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

    @Override
    public ResponseEntity<Void> findCards() {
        return CardsApi.super.findCards();
    }
}
