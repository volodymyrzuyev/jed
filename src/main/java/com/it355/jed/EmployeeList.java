package com.it355.jed;

import java.io.Serializable;
import java.util.ArrayList;

public class EmployeeList implements Serializable{
    private ArrayList<Employee> employees;

    EmployeeList() {
        employees = new ArrayList<Employee>();
    }

    public void addEmployee(String firstName, String lastName, int id, String address, String department, Double wage) {
        employees.add(new Employee(firstName, lastName, id, address, department, wage));
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public String getListNames() {
        String out = "";

        for (int i = 0; i < employees.size(); i++) {
            out += employees.get(i).getFullName() + ", ";
        }

        return out;
    }

    public String toString() {
        String out = "";
        for (int i = 0; i < employees.size(); i++) {
            out += employees.get(i).toString() + "\n";
        }
        return out;
    }

    public String getTree(String indent) {
        String out = "";
        for (int i = 0; i < employees.size(); i++) {
            out += employees.get(i).managmentTree(indent);
        }
        return out;
    }
}
