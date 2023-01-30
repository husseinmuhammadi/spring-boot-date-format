package com.javastudio.spring.dateformat.web.mapper;

import com.javastudio.spring.dateformat.dto.CardDto;
import com.javastudio.spring.dateformat.web.generated.v1.model.Card;
import org.mapstruct.Mapper;

@Mapper
public interface CardModelMapper {
    CardDto map(Card card);
    Card map(CardDto card);
}
