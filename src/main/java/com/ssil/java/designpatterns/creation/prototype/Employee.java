package com.ssil.java.designpatterns.creation.prototype;

public class Employee implements EmployeePrototype {

    private int id;
    private String name;


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public EmployeePrototype clone() {
        return new Employee(id, name);
    }
}
