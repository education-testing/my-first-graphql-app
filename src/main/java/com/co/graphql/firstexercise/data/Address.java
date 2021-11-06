package com.co.graphql.firstexercise.data;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String street;
    private String city;
    private String zipCode;
    private String country;
}
