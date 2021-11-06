package com.co.graphql.firstexercise.component.fake;

import com.co.graphql.firstexercise.data.Book;
import com.co.graphql.firstexercise.datasource.fake.FakeBookDatasource;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@DgsComponent
public class FakeBookDataResolver {

    @DgsData(parentType = "Query", field = "books")
    public List<Book> booksWrittenBy(@InputArgument(name = "author") Optional<String> authorName){
        if(!authorName.isPresent() || authorName.get() == "")
            return FakeBookDatasource.BOOK_LIST;
       return FakeBookDatasource.BOOK_LIST.stream().filter(b -> StringUtils.containsAnyIgnoreCase(b.getAuthor().getName(), authorName.get())).collect(Collectors.toList());
    }
}
