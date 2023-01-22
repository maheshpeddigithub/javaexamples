package com.ssil.java.java8.streams.map;

import java.util.stream.Stream;

public class MapToUpperMain {

    public static void main(String[] args) {
        Stream.of("abc", "bcq", "zst", "tbc", "khf")
                .map(String::toUpperCase)
                .filter(str -> str.contains("BC"))
                .forEach(System.out::println);
    }

}
