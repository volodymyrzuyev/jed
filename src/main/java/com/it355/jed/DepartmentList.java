package com.it355.jed;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class DepartmentList implements Serializable {
    private static final long serialVersionUID = 1L;

    public HashMap<String, EmployeeList> departments;
    public ArrayList<Employee> allEmps;

    /**
     * Creates an {@link ArrayList} and {@link HashMap} to store employees
     */
    DepartmentList() {
        this.departments = new HashMap<String, EmployeeList>();
        this.allEmps = new ArrayList<Employee>();
    }

    /**
     * Add the Employee to the {@link DepartmentList}
     * 
     * @param emp {@link Employee} to be added
     */
    public void addEmployee(Employee emp) {
        EmployeeList empList = getEmployeeList(emp.getDepartment());
        allEmps.add(emp);
        empList.addEmployee(emp);
    }

    /**
     * Return the {@link Employee} with a given Employee ID
     *
     * @param empID ID of the {@link Employee} you want to find
     */
    public Employee findEmployee(int empID) {
        for (int i = 0; i < allEmps.size(); i++) {
            if (allEmps.get(i).getID() == empID) {
                return allEmps.get(i);
            }
        }
        return null;
    }

    /**
     * Returns a string of the DepartmentList tree structure
     */
    public String printTree() {
        String out = "";

        for (String dept : departments.keySet()) {
            out += dept + "\n";
            out += departments.get(dept).getTree("    ");
        }

        return out;
    }

    /**
     * Retruns a string of all employees added to the list
     */
    public String toString() {
        String out = "";

        for (Employee emp : allEmps) {
            out += emp.toString();
        }

        return out;
    }

    /**
     * Retruns all employees in a given department
     *
     * @param department Name of the department you want
     */
    private EmployeeList getEmployeeList(String department) {
        if (!departments.containsKey(department)) {
            departments.put(department, new EmployeeList());
        }

        return departments.get(department);
    }

}
