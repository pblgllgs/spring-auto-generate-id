package com.pblgllgs.mongo.repository;

import com.pblgllgs.mongo.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
