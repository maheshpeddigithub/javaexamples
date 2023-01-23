package com.ssil.java.designpatterns.creation.abstractfactory;

public class BusVehicleFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle() {
        return new Bus();
    }

    @Override
    public Manufacture getManufacture() {
        return new Volvo();
    }

}
