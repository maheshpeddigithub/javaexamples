package com.ssil.java.immutable;

import java.util.HashMap;
import java.util.Map;

public final class Car {

    private final String make;
    private final int number;
    private final Map<Integer, String> spec;

    public Car(String make, int number, Map<Integer, String> spec) {
        this.make = make;
        this.number = number;
        this.spec = new HashMap<>();
        spec.forEach((k, v) -> this.spec.put(k, v));
    }

    public String getMake() {
        return make;
    }

    public int getNumber() {
        return number;
    }

    public Map getSpec() {
        Map<Integer, String> tempSpec = new HashMap<>();
        spec.forEach((k, v) -> tempSpec.put(k, v));
        return spec;
    }

}
