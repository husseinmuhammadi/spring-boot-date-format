package com.javastudio.spring.dateformat.mapper;

import com.javastudio.spring.dateformat.dto.CardDto;
import com.javastudio.spring.dateformat.model.CardEntity;
import org.mapstruct.Mapper;

@Mapper
public interface CardMapper {
    CardEntity map(CardDto card);

    CardDto map(CardEntity cardEntity);
}
