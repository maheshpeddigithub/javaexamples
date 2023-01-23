package com.ssil.java.designpatterns.creation.abstractfactory;

public class CarVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle() {
        return new Car();
    }

    @Override
    public Manufacture getManufacture() {
        return new Audi();
    }

}
