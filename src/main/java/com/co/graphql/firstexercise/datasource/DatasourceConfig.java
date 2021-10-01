package com.co.graphql.firstexercise.datasource;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatasourceConfig {

    @Bean
    public Faker faker() {
        return new Faker();
    }
}
