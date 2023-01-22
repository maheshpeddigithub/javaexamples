package com.ssil.java.java8.interfacemethods.duplicate;

public interface MyInterface1 {
    default int getVal() {
        return 1;
    }

    void display1();
    void display2();
}
