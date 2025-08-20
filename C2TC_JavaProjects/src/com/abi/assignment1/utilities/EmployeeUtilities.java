package com.abi.assignment1.utilities;


import com.abi.assignment1.employees.Employee;

/**
 * Utility class for Employee-related operations.
 * Demonstrates accessing public methods of Employee class.
 */
public class EmployeeUtilities {

    /**
     * Increases salary of an employee by given percentage.
     * @param employee The employee object
     * @param percentage The percentage increment
     */
    public void increaseSalary(Employee employee, double percentage) {
        double newSalary = employee.getSalary() + (employee.getSalary() * percentage / 100);
        employee.setSalary(newSalary);
        System.out.println("Updated Salary for " + employee.getName() + ": " + newSalary);
    }

    /**
     * Prints detailed information of the employee.
     * @param employee The employee object
     */
    public void printEmployeeDetails(Employee employee) {
        employee.displayInfo();
    }
}