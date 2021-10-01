package com.co.graphql.firstexercise.component.fake;

import com.co.graphql.firstexercise.data.Hello;
import com.co.graphql.firstexercise.datasource.fake.FakeHelloDatasource;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

import java.util.List;

@DgsComponent
public class FakeHelloDataResolver {

    @DgsQuery
    public List<Hello> allHellos() {
        return FakeHelloDatasource.HELLO_LIST;
    }

    @DgsQuery
    public Hello oneHello() {
        return Hello.builder().name("New Hello World!").randomNumber(213213).build();
    }

}
