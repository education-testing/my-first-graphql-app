package com.co.graphql.firstexercise.datasource.fake;

import com.co.graphql.firstexercise.data.Hello;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class FakeHelloDatasource {

    @Autowired private Faker faker;

    public static final List<Hello> HELLO_LIST = new ArrayList<>();

    @PostConstruct
    public void postConstructor(){
        for(int i = 0; i < 20; i++){
            HELLO_LIST.add(Hello.builder().name(faker.company().name()).randomNumber(5000).build());
        }
    }
}
