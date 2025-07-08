package me.whiteship.refactoring._13_loop.practice._33_replace_loop_with_pipeline;

import java.util.List;
import java.util.Objects;

public class Author {

    private String company;

    private String twitterHandle;

    public Author(String company, String twitterHandle) {
        this.company = company;
        this.twitterHandle = twitterHandle;
    }

    static public List<String> TwitterHandles(List<Author> authors, String company) {
        return authors.stream()
                .filter(a -> a.company.equals(company))
                .map(a -> a.twitterHandle)
                .filter(Objects::nonNull)
                .toList();
    }

}
