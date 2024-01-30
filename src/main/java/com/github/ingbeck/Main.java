package com.github.ingbeck;

public class Main {
    public static void main(String[] args) {

        Book[] books = new Book[7];
        books[0] = new Book("HarryPotter und der Stein der Weisen", "J.K. Rowling", "978-0-5450-6967-0");
        books[1] = new Book("HarryPotter und die Kammer des Schreckens", "J.K. Rowling", "978-0-4390-6486-6");
        books[2] = new Book("HarryPotter und der Gefangene von Askaban", "J.K. Rowling", "978-8-8691-8612-7");
        books[3] = new Book("HarryPotter und der Feuerkelch", "J.K. Rowling", "978-0-7569-1297-0");
        books[4] = new Book("HarryPotter und der Orden des Phönix", "J.K. Rowling", "978-1-8554-9682-8");
        books[5] = new Book("HarryPotter und der Halbblutprinz", "J.K. Rowling", "978-0-4397-9132-8");
        books[6] = new Book("HarryPotter und die Heiligtümer des Todes", "J.K. Rowling", "978-0-5450-2937-7");

        Library allHarryPotterBooks = new Library(books);
        System.out.println(allHarryPotterBooks.toString());
        System.out.println();
        allHarryPotterBooks.deleteBook("HarryPotter und der Stein der Weisen");

        System.out.println(allHarryPotterBooks.toString());
        System.out.println();

        allHarryPotterBooks.addBook("HarryPotter und das neue Buch 1", "Ingo Becker", "978-0-0347-6956-9");
        allHarryPotterBooks.addBook("HarryPotter und das neue Buch 2", "Ingo Becker", "978-0-6789-5623-9");

        System.out.println(allHarryPotterBooks.toString());


    }
}