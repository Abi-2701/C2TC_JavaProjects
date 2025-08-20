package com.Main.assignment3;

public class Main {
    public static void main(String[] args) {
        // Demonstrating Inheritance
        Book book1 = new Book(101, "Java Basics", "James Gosling");
        Magazine mag1 = new Magazine(201, "Tech Today", 45);

        book1.displayInfo();
        mag1.displayInfo();

        // Demonstrating Composition
        Library library = new Library();
        library.addItem(book1);
        library.addItem(mag1);

        library.showAllItems();
    }
}