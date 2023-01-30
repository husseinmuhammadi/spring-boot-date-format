package com.javastudio.spring.dateformat.service;

import com.javastudio.spring.dateformat.api.CardService;
import com.javastudio.spring.dateformat.dto.CardDto;
import com.javastudio.spring.dateformat.mapper.CardMapper;
import com.javastudio.spring.dateformat.model.CardEntity;
import com.javastudio.spring.dateformat.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardRepository repository;
    private final CardMapper mapper;

    @Override
    public CardDto saveCard(CardDto card) {
        CardEntity savedCard = repository.save(mapper.map(card));
        return mapper.map(savedCard);
    }

    @Override
    public List<CardDto> findAll() {
        return null;
    }
}
