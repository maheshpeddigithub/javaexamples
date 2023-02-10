package com.ssil.java.java8.streams.collect;

import java.util.stream.Stream;

public class StreamCollectMain {

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
                .map(n -> n * n)
                .filter(n -> n > 5)
                .forEach(System.out::println);
    }

}
