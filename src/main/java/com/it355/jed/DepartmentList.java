package com.it355.jed;

import java.util.ArrayList;
import java.util.HashMap;

public class DepartmentList {
    public HashMap<String, EmployeeList> departments;
    public ArrayList<Employee> allEmps;

    DepartmentList() {
        this.departments = new HashMap<String, EmployeeList>();
        this.allEmps = new ArrayList<Employee>();
    }

    public void addEmployee(String firstName, String lastName, int id, String address, String department, Double wage) {
        Employee emp = new Employee(firstName, lastName, id, address, department, wage);
        addEmployee(emp);
    }

    public void addEmployee(Employee emp) {
        EmployeeList empList = getEmployeeList(emp.getDepartment());
        addEmp(emp, empList);
    }

    public Employee findEmployee(int empID) {
        for (int i = 0; i < allEmps.size(); i++) {
            if (allEmps.get(i).getID() == empID) {
                return allEmps.get(i);
            }
        }
        return null;
    }

    public String printTree() {
        String out = "";

        for (String dept : departments.keySet()) {
            out += dept + "\n";
            out += departments.get(dept).getTree("    ");
        }

        return out;
    }

    public String toString() {
        String out = "";

        for (Employee emp : allEmps) {
            out += emp.toString();
        }

        return out;
    }

    private EmployeeList getEmployeeList(String department) {
        if (!departments.containsKey(department)) {
            departments.put(department, new EmployeeList());
        }

        return departments.get(department);
    }

    private void addEmp(Employee emp, EmployeeList empl) {
        allEmps.add(emp);
        empl.addEmployee(emp);
    }
}
