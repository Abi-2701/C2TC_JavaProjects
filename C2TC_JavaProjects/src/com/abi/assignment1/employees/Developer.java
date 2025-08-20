package com.abi.assignment1.employees;

//The Developer class extends Employee and adds programming language specialization.

public class Developer extends Employee {
   private String programmingLanguage;

   public Developer(String name, String employeeId, double salary, String programmingLanguage) {
       super(name, employeeId, salary);
       this.programmingLanguage = programmingLanguage;
   }

   public String getProgrammingLanguage() {
       return programmingLanguage;
   }

   public void setProgrammingLanguage(String programmingLanguage) {
       this.programmingLanguage = programmingLanguage;
   }

   @Override
   public void displayInfo() {
       super.displayInfo();
       System.out.println("Programming Language: " + programmingLanguage);
   }
}
