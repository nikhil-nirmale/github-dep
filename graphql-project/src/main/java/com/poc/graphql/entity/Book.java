package com.poc.graphql.entity;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Book {

    @Id
    private int id;
    private String title;
    private String description;
    private String author;
    private double price;
    private int pages;

}
