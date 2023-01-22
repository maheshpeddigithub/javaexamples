package com.ssil.java.java8.streams.foreach;

import java.util.List;
import java.util.Optional;

public class ForEachMain {

    public static void main(String args[]) {
        ForEach forEach = new ForEach();
        forEach.foreachMapOperations();
        forEach.foreachListOperations();
    }

    public static void pickLuckyNameNewWay(final List<String> names, final String startingLetter) {
        final Optional<String> luckyName = names.stream().filter(name -> name.startsWith(startingLetter)).findFirst();
        luckyName.ifPresent(System.out::println);
    }


    public String pickLuckyNameWOrElse(final List<String> names, final String startingLetter) {
        final Optional<String> luckyName = names.stream().filter(name -> name.startsWith(startingLetter)).findFirst();
        return luckyName.orElse(new String("There is no name starting with letter."));
    }

}
