package com.ssil.java.java8.streams.match;

import java.util.stream.Stream;

public class MatchMain {

    public static void main(String[] args) {

        //anyMatch
        boolean a = Stream.of("z1", "a2", "c3", "b5")
                .anyMatch(str -> str.startsWith("c"));
        System.out.println("AnyMatch-> " + a);

        //allMatch
        boolean b = Stream.of("z1", "a2", "c3", "b5")
                .allMatch(str -> str.startsWith("z"));
        System.out.println("AllMatch-> " + b);

        //noneMatch
        boolean c = Stream.of("z1", "a2", "c3", "b5")
                .noneMatch(str -> str.startsWith("d"));
        System.out.println("NoneMatch-> " + c);

    }

}
