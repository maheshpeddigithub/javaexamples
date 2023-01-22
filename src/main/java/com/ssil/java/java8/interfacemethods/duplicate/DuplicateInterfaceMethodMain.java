package com.ssil.java.java8.interfacemethods.duplicate;

public class DuplicateInterfaceMethodMain {

    public static void main(String[] args) {
        ClassForInterfaces obj = new ClassForInterfaces();
        obj.display1();
        obj.display2();
        System.out.println("Duplicate interface method val->" + obj.getVal());
    }

}
