package com.ssil.java.java8.streams.sorted;

import java.util.stream.Stream;

public class SortedMain {

    public static void main(String[] args) {
        Stream.of("z1", "a2", "c3", "b5")
                .sorted()
                .forEach(System.out::println);
    }

}
