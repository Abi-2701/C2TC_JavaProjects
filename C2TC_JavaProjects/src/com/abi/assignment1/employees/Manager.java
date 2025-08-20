package com.abi.assignment1.employees;

//The Manager class extends Employee and adds department information.

public class Manager extends Employee {
  private String department;

  public Manager(String name, String employeeId, double salary, String department) {
      super(name, employeeId, salary);
      this.department = department;
  }

  public String getDepartment() {
      return department;
  }

  public void setDepartment(String department) {
      this.department = department;
  }

  @Override
  public void displayInfo() {
      super.displayInfo();
      System.out.println("Department: " + department);
  }
}
