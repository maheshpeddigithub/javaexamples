package com.ssil.java.java8.streams.count;

import java.util.stream.Stream;

public class CountMain {

    public static void main(String[] args) {

        long cnt = Stream.of("z1", "a2", "c3", "b5", "c4")
                .filter(str -> str.startsWith("c"))
                .count();
        System.out.println("Count-> " + cnt);


    }

}
