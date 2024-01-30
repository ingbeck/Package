package com.github.ingbeck;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(Book[] books){
        this.books = books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
