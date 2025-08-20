package com.abi.inheritanceassignment;

//Subclass Book
class Book extends Item {
 // Additional attribute author
 String author;

 Book(int id, String title, String author) {
	 //invoke Item class constructor
     super(id, title);
     this.author = author;
 }

 @Override //override Item class displayInfo() method
 void displayInfo() {
     System.out.println("Book: [ID: " + id + ", Title: " + title + ", Author: " + author + "]");
 }
}