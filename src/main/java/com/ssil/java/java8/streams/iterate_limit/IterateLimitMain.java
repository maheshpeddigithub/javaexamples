package com.ssil.java.java8.streams.iterate_limit;

import java.util.stream.Stream;

public class IterateLimitMain {

    public static void main(String[] args) {
        Stream.iterate(1, count -> count + 1)
                .filter(number -> number%4 == 0)
                .limit(5)
                .forEach(System.out::println);
    }

}
