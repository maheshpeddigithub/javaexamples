package com.ssil.java.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMain {

    public static void main(String[] args) {
        StreamsMain streams = new StreamsMain();

        streams.filterEx();
        streams.concatEx();
        streams.countEx();
        streams.forEachEx();
        streams.iterateLimitEx();
        streams.mapEx();
        streams.matchEx();
        streams.sortedEx();
        streams.averagingIntEx();

        streams.objectEx();
    }


    public void filterEx() {

        Stream.of(1, 2, 3, 4, 5)
                .map(n -> n * n)
                .filter(n -> n > 5)
                .forEach(System.out::println);

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

    public void concatEx() {
        Stream<String> fruits = Arrays.stream("apple,banana,grape,kiwi".split(","));
        Stream<String> nuts = Arrays.stream("cashew,pista,almond,walnut".split(","));
        Stream.concat(nuts, fruits)
                .forEach(val -> System.out.print(val + " "));
    }

    public void countEx() {
        long cnt = Stream.of("z1", "a2", "c3", "b5", "c4")
                .filter(str -> str.startsWith("c"))
                .count();
        System.out.println("Count-> " + cnt);
    }

    public void forEachEx() {
        List<String> fruits = Arrays.asList("mango,banana,guava,infinity".split(","));
        fruits.forEach(System.out::println);


        Map<String, List<String>> phNums = new HashMap<>();

        List<String> key1Nums = new ArrayList<>();
        key1Nums.add("123");
        key1Nums.add("456");
        phNums.put("key1", key1Nums);

        List<String> key2Nums = new ArrayList<>();
        key2Nums.add("789");
        key2Nums.add("012");
        phNums.put("key2", key2Nums);

        phNums.forEach((key, value) -> {
            System.out.println("Key:" + key);
            value.forEach(System.out::println);
        });

        Map<String, List<String>> filteredNums;
        filteredNums = phNums.entrySet().stream()
                .filter(key -> key.getKey().equals("key2"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        filteredNums.forEach((key, value) -> {
            System.out.println("Key:" + key);
            value.forEach(System.out::println);
        });

    }

    public void iterateLimitEx() {
        Stream.iterate(1, count -> count + 1)
                .filter(number -> number%4 == 0)
                .limit(5)
                .forEach(System.out::println);
    }

    public void mapEx() {
        Stream.of(1, 2, 3, 4, 5)
                .map(n -> n * n)
                .filter(n -> n > 15)
                .forEach(System.out::println);

        Stream.of("abc", "bcq", "zst", "tbc", "khf")
                .map(String::toUpperCase)
                .filter(str -> str.contains("BC"))
                .forEach(System.out::println);
    }

    public void matchEx() {
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

    public void sortedEx() {
        Stream.of("z1", "a2", "c3", "b5")
                .sorted()
                .forEach(System.out::println);
    }

    public void averagingIntEx() {
        Double average = Stream.of(new Customer("c1", 5), new Customer("c2", 10), new Customer("c3", 30))
                .collect(Collectors.averagingInt(Customer::getAge));
        System.out.println("Average age->" + average);
    }

    public void objectEx() {
        Stream.of(new Customer("c1", 5), new Customer("c2", 10), new Customer("c3", 20))
                .map(Customer::getName)
                .forEach(System.out::println);

        Stream.of(new Customer("c1", 5), new Customer("c2", 10), new Customer("c3", 20))
                .filter(customer -> customer.getAge() > 9)
                .map(Customer::getName)
                .forEach(System.out::println);

        Set<Customer> filtered = Stream.of(new Customer("c1", 5), new Customer("c2", 10), new Customer("c3", 20))
                .filter(customer -> customer.getAge() > 9)
                .collect(Collectors.toSet());

        for (Customer c : filtered) {
            System.out.println(c.getName() + "<->" + c.getAge());
        }
    }

}
