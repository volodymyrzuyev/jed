package com.it355.jed;

import java.util.*;

public class Input{
      private int id;
      private String name;
      private double salary;
      private String department;

      public Input(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
      }

      public int getId() {
           return id;
      }

      public void updateSalary(double newSalary){
        this.salary = newSalary;
      }
     
      public void updateDepartment(String newDepartment){
        this.department = newDepartment;
      }

      public double calculatePay() {
          return salary / 12; //Monthly salary
      }

      public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
      }

      public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void displayDepartmentInfo() {
        System.out.println("Department: " + name);
        System.out.println("Employees:");
        for (Employee emp : employees) {
            System.out.println("- " + emp.getId() + ": " + emp.calculatePay());
        }
    }
}