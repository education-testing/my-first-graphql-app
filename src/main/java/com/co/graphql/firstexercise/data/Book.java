package com.co.graphql.firstexercise.data;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Book {
    private String tittle;
    private String publisher;
    private Author author;
    private ReleaseHistory released;
}
