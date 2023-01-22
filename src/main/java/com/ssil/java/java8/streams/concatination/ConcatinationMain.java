package com.ssil.java.java8.streams.concatination;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConcatinationMain {

    public static void main(String[] args) {
        Stream<String> fruits = Arrays.stream("apple,banana,grape,kiwi".split(","));
        Stream<String> nuts = Arrays.stream("cashew,pista,almond,walnut".split(","));
        Stream.concat(nuts, fruits)
                .forEach(val -> System.out.print(val + " "));

    }

}
