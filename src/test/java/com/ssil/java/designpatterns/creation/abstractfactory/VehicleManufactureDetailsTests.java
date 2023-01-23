package com.ssil.java.designpatterns.creation.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleManufactureDetailsTests {


    @Test
    public void testCarDetails() {
        VehicleManufactureDetails details = new VehicleManufactureDetails(new CarVehicleFactory());
        assertEquals(details.getVehicleManufactureDetails(), "Vehicle: Car Manufacture: Audi");

    }

    @Test
    public void testBusDetails() {
        VehicleManufactureDetails details = new VehicleManufactureDetails(new BusVehicleFactory());
        assertEquals(details.getVehicleManufactureDetails(), "Vehicle: Bus Manufacture: Volvo");
    }

}
