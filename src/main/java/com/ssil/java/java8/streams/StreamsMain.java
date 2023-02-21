package com.ssil.java.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMain {

    /*
    Creating Streams:
    concat()
    empty()
    generate()
    iterate()
    of()

    Intermediate Operations:
    filter()
    map()
    flatMap()
    distinct()
    sorted()
    peek()
    limit()
    skip()

    Terminal Operations:
    forEach()
    forEachOrdered()
    toArray()
    reduce()
    collect()
    min()
    max()
    count()
    anyMatch()
    allMatch()
    noneMatch()
    findFirst()
    findAny()
    */

    public static void main(String[] args) {
        StreamsMain streams = new StreamsMain();

        streams.concatEx();
        streams.emptyEx();
        streams.generateEx();
        streams.iterateEx();
        streams.ofEx();

        streams.filterEx();
        streams.mapEx();
        streams.flatMapEx();
        streams.distinctEx();
        streams.sortedEx();
        streams.peekEx();
        streams.limitEx();
        streams.skipEx();

        streams.forEachEx();
        streams.forEachOrderedEx();
        streams.toArrayEx();
        streams.reduceEx();
        streams.collectEx();
        streams.minEx();
        streams.maxEx();
        streams.countEx();
        streams.anyMatchEx();
        streams.allMatchEx();
        streams.noneMatchEx();
        streams.findFirstEx();
        streams.findAnyEx();

        streams.averagingIntEx();
        streams.averagingDoubleEx();
        streams.averagingLongEx();

        streams.objectEx();
    }

    public void concatEx() {
        Stream<String> fruits = Arrays.stream("apple,banana,grape,kiwi".split(","));
        Stream<String> nuts = Arrays.stream("cashew,pista,almond,walnut".split(","));
        Stream.concat(nuts, fruits)
                .forEach(val -> System.out.print(val + " "));
        System.out.println();
    }

    public void emptyEx() {
        Stream.empty().forEach(System.out::println);
    }

    public void generateEx() {
        Stream<Integer> randomNumbers = Stream
                .generate(() -> (new Random()).nextInt(100));
        randomNumbers.limit(20).forEach(System.out::println);
    }

    public void iterateEx() {
        Stream.iterate(1, count -> count + 1)
                .filter(number -> number % 4 == 0)
                .limit(5)
                .forEach(System.out::println);
    }

    public void ofEx() {
        Stream.of("apple%banana%grape%orange".split("%"))
                .forEach(System.out::println);
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

    public void flatMapEx() {
    }

    public void distinctEx() {
        Stream.of(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5)
                .distinct()
                .forEach(System.out::println);
    }

    public void sortedEx() {
        Stream.of("z1", "a2", "c3", "b5")
                .sorted()
                .forEach(System.out::println);
    }

    public void peekEx() {
        Stream.of(1, 2, 3, 4, 5)
                .peek(System.out::println)
                .map(n -> n * n)
                .peek(System.out::println)
                .filter(n -> n > 5)
                .forEach(System.out::println);
    }

    public void limitEx() {
    }

    public void skipEx() {
        Stream.of(1, 2, 3, 4, 5)
                .map(n -> n * n)
                .filter(n -> n > 5)
                .skip(2)
                .forEach(System.out::println);
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

    public void forEachOrderedEx() {
    }

    public void toArrayEx() {
    }

    public void reduceEx() {
        Stream<String> fruits = Arrays.stream("apple,banana,grape,kiwi".split(","));
        Optional<String> reduced = fruits.reduce((s1, s2) -> s1 + "$" + s2);
        reduced.ifPresent(System.out::println);
    }

    public void collectEx() {
        List<String> strs = Stream.of("my name is Johnny".split(" "))
                .filter(str -> str.contains("n"))
                .collect(Collectors.toList());
        System.out.println(strs);
    }

    public void minEx() {
        int i = Stream.of(9,8,6,3,7,4,5)
                .min(Comparator.comparing(Integer::valueOf))
                .get();
       System.out.println(i);
    }

    public void maxEx() {
        int i = Stream.of(9,8,6,3,7,4,5)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println(i);
    }

    public void countEx() {
        long cnt = Stream.of("z1", "a2", "c3", "b5", "c4")
                .filter(str -> str.startsWith("c"))
                .count();
        System.out.println("Count-> " + cnt);
    }

    public void anyMatchEx() {
        boolean a = Stream.of("z1", "a2", "c3", "b5")
                .anyMatch(str -> str.startsWith("c"));
        System.out.println("AnyMatch-> " + a);
    }

    public void allMatchEx() {
        boolean b = Stream.of("z1", "a2", "c3", "b5")
                .allMatch(str -> str.startsWith("z"));
        System.out.println("AllMatch-> " + b);
    }

    public void noneMatchEx() {
        boolean c = Stream.of("z1", "a2", "c3", "b5")
                .noneMatch(str -> str.startsWith("d"));
        System.out.println("NoneMatch-> " + c);
    }

    public void findFirstEx() {
        Optional<String> findfirst = Stream.of("a1", "a2", "a3", "a4", "a5")
                .filter(str -> str.equals("a2"))
                .findFirst();
        findfirst.ifPresent(System.out::println);
    }

    public void findAnyEx() {
        Optional<String> findfirst = Stream.of("a1", "a2", "a3", "a4", "a5")
                .filter(str -> str.equals("a2"))
                .findAny();
        findfirst.ifPresent(System.out::println);
    }


    public void averagingIntEx() {
        Double average = Stream.of(new Customer("c1", 5), new Customer("c2", 10), new Customer("c3", 30))
                .collect(Collectors.averagingInt(Customer::getAge));
        System.out.println("Average age->" + average);
    }

    public void averagingDoubleEx() {
        Double average = Stream.of(2.22, 3.33, 4.44, 5.55, 6.66)
                .collect(Collectors.averagingDouble(num -> num));
        System.out.println("Average Double->" + average);
    }

    public void averagingLongEx() {
        Double average = Stream.of(2L, 3L, 4L, 5L, 6L)
                .collect(Collectors.averagingLong(num -> num));
        System.out.println("Average Double->" + average);
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
