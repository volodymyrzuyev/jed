package com.it355.jed;

import java.io.Serializable;

public class Employee implements Serializable{
    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private int empId;
    private String address;
    private String department;
    private Double wage;
    private EmployeeList managmentList;

    Employee(String firstName, String lastName, int id, String address, String department, Double wage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empId = id;
        this.address = address;
        this.department = department;
        this.wage = wage;
        this.managmentList = new EmployeeList();
    }

    Employee(Employee orig) {
        this.firstName = orig.firstName;
        this.lastName = orig.lastName;
        this.address = orig.address;
        this.department = orig.department;
        this.wage = orig.wage;
        this.managmentList = orig.managmentList;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getID() {
        return this.empId;
    }

    public String getAddress() {
        return address;
    }

    public String getDepartment() {
        return department;
    }

    public Double getWage() {
        return wage;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    public void addEmployeeToManage(Employee employee) {
        managmentList.addEmployee(employee);
    }

    public String managmentTree(String indent) {
        String out = indent + getFullName() + "\n";
        out += managmentList.getTree(indent + "    ");
        return out;
    }

    public Double calculatePay(Double hours) {
        Double rem = hours - 40;
        if (rem < 0) {
            return hours * wage;
        } else {
            return (40 * wage) + (rem * wage * 1.5);
        }
    }

    public String toString() {
        return String.format("Name: %s %s, ID: %d, Department: %s, Manages: %sLives At: %sMakes: %.2f$ per hour",
                firstName,
                lastName, empId, department, managmentList.getListNames(), address, wage);

    }

}
