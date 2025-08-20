package com.abi.assignment3;

import java.util.ArrayList;

class Library {
    private ArrayList<Item> items;
    
    //constructor to initialize collection (ArrayList)
    Library() {
        items = new ArrayList<>();
    }
    
    // Add items into the collection
    void addItem(Item item) {
        items.add(item);
    }
    
    // Show all items in the collection
    void showAllItems() {
        System.out.println("Library contains:");
        for (Item item : items) {
            if (item instanceof Book) {
                Book b = (Book) item;
                System.out.println("- " + b.title + " by " + b.author);
            } 
            else if (item instanceof Magazine) 
            {
                Magazine m = (Magazine) item;
                System.out.println("- " + m.title + " Issue " + m.issueNumber);
            }
        }
    }
}