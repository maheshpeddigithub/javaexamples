package com.ssil.java.java8.streams.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ForEach {

    public void foreachMapOperations() {
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

    public void foreachListOperations() {
        List<String> fruits = Arrays.asList("mango,banana,guava,infinity".split(","));
        fruits.forEach(System.out::println);
    }

}
