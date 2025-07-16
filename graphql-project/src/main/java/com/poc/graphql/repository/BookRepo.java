package com.poc.graphql.repository;

import com.poc.graphql.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends MongoRepository<Book,Integer> {

}
