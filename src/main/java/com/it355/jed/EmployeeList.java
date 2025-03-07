package com.it355.jed;

import java.io.Serializable;
import java.util.ArrayList;

public class EmployeeList implements Serializable {
    private ArrayList<Employee> employees;

    /**
     * Creates a new {@link EmployeeList}. Uses {@link ArrayList} to store employees
     */
    EmployeeList() {
        employees = new ArrayList<Employee>();
    }

    /**
     * Adds {@link Employee} to list
     *
     * @param emp Eployee to be added
     */
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    /**
     * Retrns the names of all Employees in the list as a string
     */
    public String getListNames() {
        String out = "";

        for (int i = 0; i < employees.size(); i++) {
            out += employees.get(i).getFullName() + ", ";
        }

        return out;
    }

    /**
     * Retruns the string of all employee info in a list
     */
    public String toString() {
        String out = "";
        for (int i = 0; i < employees.size(); i++) {
            out += employees.get(i).toString() + "\n";
        }
        return out;
    }

    /**
     * Retruns a string of the tree structure of the list
     *
     * @param indent the indent level of the operation
     */
    public String getTree(String indent) {
        String out = "";
        for (int i = 0; i < employees.size(); i++) {
            out += employees.get(i).managmentTree(indent);
        }
        return out;
    }
}
