package com.abi.assignment1.main;


import com.abi.assignment1.employees.Manager;
import com.abi.assignment1.utilities.EmployeeUtilities;
import com.abi.assignment1.employees.Developer;

  //Main class to test Employee, Manager, Developer and Utilities.

public class AssignmentMain {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", "M001", 80000, "IT");
        Developer dev = new Developer("Bob", "D001", 60000, "Java");

        EmployeeUtilities util = new EmployeeUtilities();

        util.printEmployeeDetails(mgr);
        util.printEmployeeDetails(dev);

        util.increaseSalary(mgr, 10);
        util.increaseSalary(dev, 15);

        util.printEmployeeDetails(mgr);
        util.printEmployeeDetails(dev);
    }
}
