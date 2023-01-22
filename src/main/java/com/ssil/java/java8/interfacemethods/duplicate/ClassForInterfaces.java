package com.ssil.java.java8.interfacemethods.duplicate;

public class ClassForInterfaces implements MyInterface1, MyInterface2 {

    @Override
    public int getVal() {
        return 0;
    }

    @Override
    public void display1() {
        System.out.println("Val1");
    }

    @Override
    public void display2() {
        System.out.println("Val2");
    }
}
