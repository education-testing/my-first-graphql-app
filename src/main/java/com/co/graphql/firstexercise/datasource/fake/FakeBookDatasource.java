package com.co.graphql.firstexercise.datasource.fake;

import com.co.graphql.firstexercise.data.Address;
import com.co.graphql.firstexercise.data.Author;
import com.co.graphql.firstexercise.data.Book;
import com.co.graphql.firstexercise.data.ReleaseHistory;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class FakeBookDatasource {

    @Autowired
    private Faker faker;

    public static final List<Book> BOOK_LIST = new ArrayList<>();

    @PostConstruct
    private void postConstructor(){
        for(int i = 0; i < 20; i++){
            List<Address> addresses = new ArrayList<>();
            Author author = Author.builder().name(faker.book().author()).originCountry(faker.country().name()).addresses(addresses).build();
            ReleaseHistory releaseHistory = ReleaseHistory.builder().printedEdition(faker.bool().bool()).releasedCountry(faker.country().name()).year(faker.number().numberBetween(2019, 2021)).build();
            Book book = Book.builder().author(author).released(releaseHistory).publisher(faker.book().publisher()).tittle(faker.book().title()).build();

            for(int j = 0; j < 3; j++){
                Address address = Address.builder().country(faker.country().name()).street(faker.address().streetAddress()).zipCode(faker.address().zipCode()).build();
                addresses.add(address);
            }

            BOOK_LIST.add(book);
        }
    }
}
