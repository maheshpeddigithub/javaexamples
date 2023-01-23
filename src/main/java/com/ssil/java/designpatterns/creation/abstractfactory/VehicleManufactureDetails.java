package com.ssil.java.designpatterns.creation.abstractfactory;

public class VehicleManufactureDetails {

    private Vehicle vehicle;

    private Manufacture manufacture;

    public VehicleManufactureDetails(VehicleFactory factory) {
        vehicle = factory.getVehicle();
        manufacture = factory.getManufacture();
    }

    public String getVehicleManufactureDetails() {
        return "Vehicle: " + vehicle.getVehicle() + " Manufacture: " + manufacture.getManufacture();
    }

}
