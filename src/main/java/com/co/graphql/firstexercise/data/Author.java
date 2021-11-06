package com.co.graphql.firstexercise.data;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Author {
    private String name;
    private String originCountry;
    private List<Address> addresses;
}
