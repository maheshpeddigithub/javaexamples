package com.ssil.java.designpatterns.structural.adapter;

public class Audi implements Car {
    @Override
    public String getNumber() {
        return "1234";
    }

    @Override
    public String honk() {
        return "Peep";
    }
}
