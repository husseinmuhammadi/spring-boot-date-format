package com.javastudio.spring.dateformat.repository;

import com.javastudio.spring.dateformat.model.CardEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends MongoRepository<CardEntity, String> {
}
