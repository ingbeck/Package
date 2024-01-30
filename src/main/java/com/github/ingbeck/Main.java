package com.github.ingbeck;

public class Main {
    public static void main(String[] args) {

        //declaration of Array 'books' with length 7
        Book[] books = new Book[7];

        //initialization of every element in 'books'
        books[0] = new Book("Harry Potter und der Stein der Weisen", "J.K. Rowling", "978-0-5450-6967-0");   //create instance of the class 'Book'
        books[1] = new Book("Harry Potter und die Kammer des Schreckens", "J.K. Rowling", "978-0-4390-6486-6");
        books[2] = new Book("Harry Potter und der Gefangene von Askaban", "J.K. Rowling", "978-8-8691-8612-7");
        books[3] = new Book("Harry Potter und der Feuerkelch", "J.K. Rowling", "978-0-7569-1297-0");
        books[4] = new Book("Harry Potter und der Orden des Phönix", "J.K. Rowling", "978-1-8554-9682-8");
        books[5] = new Book("Harry Potter und der Halbblutprinz", "J.K. Rowling", "978-0-4397-9132-8");
        books[6] = new Book("Harry Potter und die Heiligtümer des Todes", "J.K. Rowling", "978-0-5450-2937-7");

        //create instance 'library' of class 'Library' with Array 'books'
        Library library = new Library(books);

        //create more objects of 'Book' for further use
        Book deleteBook = books[2];
        Book addBook = new Book("Harry Potter und das neue Buch 2", "Ingo Becker", "978-0-6789-5623-9");

        //print the value of 'library' to console
        System.out.println(library.toString());
        System.out.println();

        //delete element of 'books' in 'library' by title
        library.deleteBook("Harry Potter und der Stein der Weisen");
        library.deleteBook("Harry Potter und die Heiligtümer des Todes");

        //delete element of 'books' in 'library' by searching the same object of 'Book'
        library.deleteBook(deleteBook);

        //try to delete an element of 'books' that does not exist
        library.deleteBook("Schönes Buch");

        //print the value of 'library' to console
        System.out.println(library.toString());
        System.out.println();

        //add an element of 'books' to 'library' by creating a new object of 'Book'
        library.addBook("Harry Potter und das neue Buch 1", "Ingo Becker", "978-0-0347-6956-9");

        //add an element of 'books' to 'library' by giving an object of 'Book'
        library.addBook(addBook);


        ////print the value of 'library' to console
        System.out.println(library.toString());


    }
}