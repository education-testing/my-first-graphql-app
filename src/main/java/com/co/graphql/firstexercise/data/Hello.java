package com.co.graphql.firstexercise.data;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Hello {

    public String name;
    public int randomNumber;

}
