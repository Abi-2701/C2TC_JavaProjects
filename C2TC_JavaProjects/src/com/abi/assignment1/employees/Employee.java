package com.abi.assignment1.employees;


/**
 * The Employee class represents a generic employee in the organization.
 * It demonstrates encapsulation by keeping fields private and
 * exposing them through public getter and setter methods.
 */
public class Employee {
    // Private attributes - accessible only within this class
    private String name;
    private String employeeId;
    private double salary;

    //Constructor to initialize Employee details
    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getter and Setter methods for private attributes

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    protected void setEmployeeId(String employeeId) {
        // protected: accessible within same package & subclasses
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary >= 0) {
            this.salary = salary;
        }
    }

    //Displays basic employee information.

    public void displayInfo() {
        System.out.println("Employee: " + name + " | ID: " + employeeId + " | Salary: " + salary);
    }
}
