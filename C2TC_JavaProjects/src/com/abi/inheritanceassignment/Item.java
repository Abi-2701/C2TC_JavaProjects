package com.abi.inheritanceassignment;

//Part A – Inheritance (is-a relationship)

//Base class
class Item {
 int id;
 String title;
 //Constructor 
 Item(int id, String title) {
     this.id = id;
     this.title = title;
 }
 
 //To display Item info
 void displayInfo() {
     System.out.println("ID: " + id + ", Title: " + title);
 }
}