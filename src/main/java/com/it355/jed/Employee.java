package com.it355.jed;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private int empId;
    private String address;
    private String department;
    private Double wage;
    private EmployeeList managmentList;

    /**
     * Creates a new {@link Employee}
     *
     * @param firstName  first name of employee
     * @param lastName   last name of the employee
     * @param id         id of the Employee
     * @param address    home adress of the Employee
     * @param department department name of the employee
     * @param wage       wage of the employee
     */
    Employee(String firstName, String lastName, int id, String address, String department, Double wage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empId = id;
        this.address = address;
        this.department = department;
        this.wage = wage;
        this.managmentList = new EmployeeList();
    }

    /**
     * Retruns first name of employee as a string
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Retruns last name of employee as a string
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Retruns full name of employee as a string
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /**
     * Retruns id of employee as a int
     */
    public int getID() {
        return this.empId;
    }

    /**
     * Retruns home adress of employee as a string
     */
    public String getAddress() {
        return address;
    }

    /**
     * Retruns department name of employee as a string
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Retruns wage of employee as a Double
     */
    public Double getWage() {
        return wage;
    }

    /**
     * Changes employee department name
     *
     * @param department name of new department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Sets new wage of employee
     * 
     * @param wage new employee wage
     */
    public void setWage(Double wage) {
        this.wage = wage;
    }

    /**
     * Adds employee to manage to current employee
     *
     * @param employee new subject
     */
    public void addEmployeeToManage(Employee employee) {
        managmentList.addEmployee(employee);
    }

    /**
     * Returns current management tree as a string
     *
     * @param indent indent level of the current tree
     */
    public String managmentTree(String indent) {
        String out = indent + getFullName() + "\n";
        out += managmentList.getTree(indent + "    ");
        return out;
    }

    /**
     * Calculates pay of employee based on hours worked
     * If hours if < 40, they are overtime 1.5*hours
     *
     * @param hours hours employee worked
     */
    public Double calculatePay(Double hours) {
        Double rem = hours - 40;
        if (rem < 0) {
            return hours * wage;
        } else {
            return (40 * wage) + (rem * wage * 1.5);
        }
    }

    /**
     * Displays employee info
     */
    public String toString() {
        return String.format("Name: %s %s, ID: %d, Department: %s, Manages: %sLives At: %s Makes: %.2f$ per hour",
                firstName,
                lastName, empId, department, managmentList.getListNames(), address, wage);

    }

}
