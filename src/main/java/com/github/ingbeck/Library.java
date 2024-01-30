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

    public void deleteBook(String title){
        Book[] newBooks = new Book[books.length -1];
        int count = 0;

        for (Book book : books) {
            if (!book.getTitle().equals(title)) {
                newBooks[count] = book;
                count++;
            }
        }
        this.books = newBooks;
    }

    public void addBook(String title, String author, String isbn){
        Book[] newBooks = new Book[books.length +1];
        int count = 0;

        for (Book book : books) {
            newBooks[count] = book;
            count++;
        }
        newBooks[newBooks.length-1] = new Book(title, author, isbn);
        this.books = newBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(books);
    }
}
