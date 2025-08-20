package com.abi.assignment3;

//Subclass Magazine
class Magazine extends Item {
 int issueNumber;

 Magazine(int id, String title, int issueNumber) {
     super(id, title);
     this.issueNumber = issueNumber;
 }

 @Override
 void displayInfo() {
     System.out.println("Magazine: [ID: " + id + ", Title: " + title + ", Issue: " + issueNumber + "]");
 }
}