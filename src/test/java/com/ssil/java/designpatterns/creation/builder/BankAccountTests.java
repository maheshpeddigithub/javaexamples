package com.ssil.java.designpatterns.creation.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTests {


    @Test
    public void testBankAccountBuilder() {
        BankAccount account =  new BankAccount.Builder(1).setName("a").setBranch("b").build();
        assertEquals(account.getNumber(), 1);
        assertEquals(account.getName(), "a");
        assertEquals(account.getBranch(), "b");
        assertEquals(account.getAccountDetails(), "Number: 1 Name: a Branch: b");
    }

}
