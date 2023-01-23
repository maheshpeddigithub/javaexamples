package com.ssil.java.designpatterns.creation.singleton;

public class Book {

    private static Book book = null;

    private String title;


    private Book() {

    }

    public static Book getInstance() {
        if (book == null) {
            book = new Book();
        }
        return book;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
