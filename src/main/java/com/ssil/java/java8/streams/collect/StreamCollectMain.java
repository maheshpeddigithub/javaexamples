package com.ssil.java.java8.streams.collect;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectMain {

    public static void main(String[] args) {
        List<Integer> numbs = Stream.of(1, 2, 3, 4, 5)
                .map(n -> n * n)
                .filter(n -> n > 5)
                .collect(Collectors.toList());
        numbs.forEach(System.out::println);
    }

}
