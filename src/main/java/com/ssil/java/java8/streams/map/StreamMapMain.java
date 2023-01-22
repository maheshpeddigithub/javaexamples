package com.ssil.java.java8.streams.map;

import java.util.stream.Stream;

public class StreamMapMain {

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
                .map(n -> n * n)
                .filter(n -> n > 15)
                .forEach(System.out::println);
    }

}
