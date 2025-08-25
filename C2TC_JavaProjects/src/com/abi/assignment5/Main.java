package com.abi.assignment5;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read booking details
        String bookingDetails = sc.nextLine();
        String[] parts = bookingDetails.split(",");
        TicketBooking tb = new TicketBooking(parts[0], parts[1], Integer.parseInt(parts[2]));

        // Read payment mode
        int mode = sc.nextInt();
        sc.nextLine(); // consume newline

        // Print booking details
        System.out.println("Stage event:" + tb.getStageEvent());
        System.out.println("Customer:" + tb.getCustomer());
        System.out.println("Number of seats:" + tb.getNoOfSeats());

        // Payment processing
        switch (mode) {
            case 1:
                int cashAmount = sc.nextInt();
                tb.payment(cashAmount);
                break;

            case 2:
                int walletAmount = sc.nextInt();
                sc.nextLine();
                String walletNo = sc.nextLine();
                tb.payment(walletAmount, walletNo);
                break;

            case 3:
                String holderName = sc.nextLine();
                int cardAmount = sc.nextInt();
                sc.nextLine();
                String cardType = sc.nextLine();
                String ccv = sc.nextLine();
                tb.payment(holderName, cardAmount, cardType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}