package com.ssil.java.designpatterns.structural.adapter;

public class CarAdapter implements Truck {

    private Car car;

    public CarAdapter(Car car) {
        this.car = car;
    }


    @Override
    public String horn() {
        return car.honk();
    }
}
