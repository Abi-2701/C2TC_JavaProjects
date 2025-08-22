package com.abi.assignment4;

import java.text.DecimalFormat;

//Step 2: AirIndia class
class AirIndia implements Airfare {
 private int hours;
 private double costPerHour;

 // Default constructor
 public AirIndia() {}

 // Parameterized constructor
 public AirIndia(int hours, double costPerHour) {
     this.hours = hours;
     this.costPerHour = costPerHour;
 }

 // Getters and Setters
 public int getHours() { return hours; }
 public void setHours(int hours) { this.hours = hours; }

 public double getCostPerHour() { return costPerHour; }
 public void setCostPerHour(double costPerHour) { this.costPerHour = costPerHour; }

 // Method implementation
 @Override
 public double calculateAmount() {
     return hours * costPerHour;
 }

 @Override
 public void display() {
     DecimalFormat df = new DecimalFormat("0.00");
     System.out.println(df.format(calculateAmount()));
 }
}