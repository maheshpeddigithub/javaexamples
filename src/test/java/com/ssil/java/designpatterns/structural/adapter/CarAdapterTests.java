package com.ssil.java.designpatterns.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarAdapterTests {

    @Test
    public void testCarAdapter() {
        Audi audi = new Audi();
        Scania scania = new Scania();
        CarAdapter adapter = new CarAdapter(audi);

        assertEquals(audi.getNumber(), "1234");
        assertEquals(audi.honk(), "Peep");
        assertEquals(scania.horn(), "Keek");
        assertEquals(adapter.horn(), "Peep");

    }

}
