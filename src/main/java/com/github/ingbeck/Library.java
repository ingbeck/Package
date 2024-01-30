package com.github.ingbeck;

import java.util.Arrays;

public class Library {
    //Attributes
    private Book[] books;

    //Constructor
    public Library(Book[] books){
        this.books = books;
    }

    //Getter / Setter
    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }


    //method for checking, if a book exists in 'books'
    //searching by its title
    public boolean isInLibrary(String title){

        boolean bookFound = false;

        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                bookFound = true;
            }
        }
        return bookFound;
    }

    //overloaded method for checking, if a book exists in 'books'
    //searching by the exact same book
    public boolean isInLibrary(Book bookToDelete){
        boolean bookFound = false;

        for (Book book : books) {
            if (book.equals(bookToDelete)) {
                bookFound = true;
            }
        }
        return bookFound;
    }

    //method for deleteing an element of 'books' by its title
    public void deleteBook(String title){

        if(isInLibrary(title)){
            Book[] newBooks = new Book[books.length -1];
            int count = 0;

            for (Book book : books) {
                if (!book.getTitle().equals(title)) {
                    newBooks[count] = book;
                    count++;
                }
            }
            this.books = newBooks;
        }else{
            System.out.println("\nBook [" + title + "] not found in library!\n");
        }

    }

    //overloaded method for deleting an exact element of 'books'
    public void deleteBook(Book bookToDelete){

        if(isInLibrary(bookToDelete)){
            Book[] newBooks = new Book[books.length -1];
            int count = 0;

            for (Book book : books) {
                if (!book.equals(bookToDelete)) {
                    newBooks[count] = book;
                    count++;
                }
            }
            this.books = newBooks;
        }

    }

    //method to add an element of 'books' to 'library' by creating a new object of 'Book'
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

    //overloaded method to add an element of 'books' to 'library' by giving an object of 'Book'
    public void addBook(Book newBook){
        Book[] newBooks = new Book[books.length +1];
        int count = 0;

        for (Book book : books) {
            newBooks[count] = book;
            count++;
        }
        newBooks[newBooks.length-1] = newBook;
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
