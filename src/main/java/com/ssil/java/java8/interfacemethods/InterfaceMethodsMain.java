package com.ssil.java.java8.interfacemethods;

public class InterfaceMethodsMain {

    public static void main(String[] args) {
        Vehicle bus = new Bus();

        // default method call
        bus.blowHorn();

        // instance method call
        bus.printName();

        // static method call
        Vehicle.status();
    }

}
