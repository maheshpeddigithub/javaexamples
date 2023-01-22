package com.ssil.java.java8.streams.withobjects;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WithObjectsMain {

    public static void main(String[] args) {

        // map
        Stream.of(new Customer("c1", 5), new Customer("c2", 10), new Customer("c3", 20))
                .map(Customer::getName)
                .forEach(System.out::println);

        System.out.println();

        // map
        Stream.of(new Customer("c1", 5), new Customer("c2", 10), new Customer("c3", 20))
                .filter(customer -> customer.getAge() > 9)
                .map(Customer::getName)
                .forEach(System.out::println);

        System.out.println();

        // set
        Set<Customer> filtered = Stream.of(new Customer("c1", 5), new Customer("c2", 10), new Customer("c3", 20))
                .filter(customer -> customer.getAge() > 9)
                .collect(Collectors.toSet());

        for (Customer c : filtered) {
            System.out.println(c.getName() + "<->" + c.getAge());
        }


        System.out.println();

        // averagingInt
        Double average = Stream.of(new Customer("c1", 5), new Customer("c2", 10), new Customer("c3", 30))
                .collect(Collectors.averagingInt(Customer::getAge));
        System.out.println("Average age->" + average);

    }

}
