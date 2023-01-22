package com.ssil.java.java8.streams.filter;

import java.util.ArrayList;
import java.util.List;

public class Filter2Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("apple");
        names.add("banana");
        names.add("grape");
        names.add("kiwi");
        names.add("orange");

        names.stream()
                .filter(name -> name.length() > 5)
                .forEach(System.out::println);

    }

}
