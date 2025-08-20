package com.abi.assignment2;

import java.util.Scanner;

//Student class with default constructor
class Student {
 // Default constructor
 Student() {
     System.out.println("Student object is created");
 }
}

//Commission class
class Commission {
 // Data Members
 String name;
 String address;
 String phone;
 double sales_amount;

 // Method (i) To accept details of the sales employee
 void acceptDetails() {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Name: ");
     name = sc.nextLine();

     System.out.print("Enter Address: ");
     address = sc.nextLine();

     System.out.print("Enter Phone Number: ");
     phone = sc.nextLine();

     System.out.print("Enter Sales Amount: ");
     sales_amount = sc.nextDouble();
 }

 // Method (ii) To calculate commission
 void calculateCommission() {
     double commission = 0.0;

     if (sales_amount >= 100000) {
         commission = sales_amount * 0.10;
     } else if (sales_amount >= 50000) {
         commission = sales_amount * 0.05;
     } else if (sales_amount >= 30000) {
         commission = sales_amount * 0.03;
     } else {
         commission = 0.0;
     }

     System.out.println("Commission earned: " + commission);
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     // Creating Student object (default constructor will print message)
     Student s = new Student();

     // Creating Commission object
     Commission c = new Commission();
     c.acceptDetails();       // Accept employee details
     c.calculateCommission(); // Calculate and display commission
 }
}