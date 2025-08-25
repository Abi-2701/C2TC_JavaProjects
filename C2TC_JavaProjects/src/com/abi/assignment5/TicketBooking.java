package com.abi.assignment5;

class TicketBooking {
    private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    // Default Constructor
    public TicketBooking() {}

    // Parameterized Constructor
    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Getters and Setters
    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // Overloaded Payment methods
    public void payment(int amount) {
        System.out.printf("Amount %.1f paid in cash\n", (double) amount);
    }

    public void payment(int amount, String walletNumber) {
        System.out.printf("Amount %.1f paid using wallet number %s\n", (double) amount, walletNumber);
    }

    public void payment(String cardHolderName, int amount, String cardType, String ccv) {
        System.out.printf("Holder name:%s\n", cardHolderName);
        System.out.printf("Amount %.1f paid using %s card\n", (double) amount, cardType);
        System.out.printf("CCV:%s\n", ccv);
    }
}