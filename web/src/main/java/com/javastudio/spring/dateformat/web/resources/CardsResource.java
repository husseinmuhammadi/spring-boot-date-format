package com.javastudio.spring.dateformat.web.resources;

import com.javastudio.spring.dateformat.web.generated.v1.api.CardsApi;
import com.javastudio.spring.dateformat.web.generated.v1.model.Card;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CardsResource implements CardsApi {

    @Override
    public ResponseEntity<Void> createNewCard(Card card) {
        return CardsApi.super.createNewCard(card);
    }

    @Override
    public ResponseEntity<Void> findCards() {
        return CardsApi.super.findCards();
    }
}
