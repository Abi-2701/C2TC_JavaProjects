package com.abi.assignment4;

import java.text.DecimalFormat;

class KingFisher implements Airfare {
    private int hours;
    private double costPerHour;

    public KingFisher() {}

    public KingFisher(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    public int getHours() { return hours; }
    public void setHours(int hours) { this.hours = hours; }

    public double getCostPerHour() { return costPerHour; }
    public void setCostPerHour(double costPerHour) { this.costPerHour = costPerHour; }

    @Override
    public double calculateAmount() {
        return (hours * costPerHour) * 4;
    }

    @Override
    public void display() {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(calculateAmount()));
    }
}