package com.ssil.java.designpatterns.creation.builder;

public class BankAccount {

    // required param
    private Integer number;

    // optional param
    private String name;

    // optional param
    private String branch;

    private BankAccount(Builder builder) {
        this.number = builder.number;
        this.name = builder.name;
        this.branch = builder.branch;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public String getAccountDetails() {
        return "Number: " + number + " Name: " + name + " Branch: " + branch;
    }

    public static class Builder {

        // required param
        private Integer number;

        // optional param
        private String name;

        // optional param
        private String branch;

        public Builder(Integer number) {
            this.number = number;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }

    }

}
