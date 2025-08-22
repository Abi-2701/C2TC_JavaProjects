package com.abi.assignment4;

import java.util.Scanner;

//Step 5: Driver class
public class AirfareDemo {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int choice = sc.nextInt();      // 1 = AirIndia, 2 = KingFisher, 3 = Indigo
     int hours = sc.nextInt();
     double costPerHour = sc.nextDouble();

     Airfare flight = null;

     switch(choice) {
         case 1:
             flight = new AirIndia(hours, costPerHour);
             break;
         case 2:
             flight = new KingFisher(hours, costPerHour);
             break;
         case 3:
             flight = new Indigo(hours, costPerHour);
             break;
         default:
             System.out.println("Invalid Choice");
             System.exit(0);
     }

     flight.display();
     sc.close();
 }
}