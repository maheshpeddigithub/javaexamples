package com.ssil.java.immutable;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTests {


    @Test
    public void testCar() {
        Map<Integer, String> spec = new HashMap<>();
        spec.put(1, "one");
        spec.put(2, "two");

        Car car = new Car("Audi", 9999, spec);

        assertEquals(car.getMake(), "Audi");
        assertEquals(car.getNumber(), 9999);

        Map<String, String> returnedSpec = car.getSpec();

        assertEquals(returnedSpec.size(), 2);
        String val = returnedSpec.get(2);
        assertEquals("two", val);
    }

}
