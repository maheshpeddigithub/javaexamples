package com.ssil.java.designpatterns.creation.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTests {

    @Test
    public void testBookSingleton() {
        Book book1 = Book.getInstance();
        book1.setTitle("Harry Potter");
        assertEquals(book1.getTitle(), "Harry Potter");

        Book book2 = Book.getInstance();
        assertEquals(book2.getTitle(), "Harry Potter");
        book2.setTitle("James Bond");
        assertEquals(book2.getTitle(), "James Bond");

        Book book3 = Book.getInstance();
        assertEquals(book3.getTitle(), "James Bond");
    }

}
