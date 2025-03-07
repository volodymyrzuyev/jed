package com.it355.jed;

import java.util.*;


public class NewInput {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<DepartmentList> departments = new ArrayList<>();
        FileStorage fileStorage = new FileStorage();
        
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Salary");
            System.out.println("3. Update Department");
            System.out.println("4. Display Employee Info");
            System.out.println("5. Display Department Info");
            System.out.println("6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double wage = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = scanner.nextLine();
                    
                    Employee emp = new Employee(id, name, wage, dept);
                    employees.add(emp);

                    DepartmentList dpt = findDepartment(departments, dept);
                    if (dpt == null) {
                        dpt = new DepartmentList(dept);
                        departments.add(dpt);
                    }
                    dpt.addEmployee(emp);
                    System.out.println("Employee added successfully!");
                    break;
                case 2:
                    System.out.print("Enter Employee ID to update salary: ");
                    id = scanner.nextInt();
                    Employee employee = findEmployee(employees, id);
                    if (employee != null) {
                      System.out.print("Enter new salary: ");
                      double newSalary = scanner.nextDouble();
                      employee.updateSalary(newSalary);
                      System.out.println("Salary updated successfully!");
                      } else {
                      System.out.println("Employee not found.");
                      }
                    break;
                case 3:
                    System.out.print("Enter Employee ID to update department: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    employee = findEmployee(employees, id);
                    if (employee != null) {
                      System.out.print("Enter new department: ");
                      String newDptName = scanner.nextLine();
                      DepartmentList newDpt = findDepartment(departments, newDptName);
                      if (newDept == null) {
                          newDept = new DepartmentList(newDeptName);
                          departments.add(newDpt);
                      }
                      employee.updateDepartment(newDptName);
                      newDpt.addEmployee(employee);
                      System.out.println("Department updated successfully!");
                      } else {
                      System.out.println("Employee not found.");
                      }
                    break;
                case 4:
                    System.out.print("Enter Employee ID to display info: ");
                    id = scanner.nextInt();
                    employee = findEmployee(employees, id);
                    if (employee != null) {
                      employee.displayEmployeeInfo();
                    } else {
                      System.out.println("Employee not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Department name: ");
                    String deptName = scanner.nextLine();
                    DepartmentList department = findDepartment(departments, deptName);
                    if (dpt != null) {
                      department.displayDepartmentInfo();
                    } else {
                      System.out.println("Department not found.");
                    }
                  break;
                 case 6:
                    System.out.println("Storing file");
                    fileStorage.storeFile(employees);
                  break;
                 case 7:
                    System.out.println("Storing file");
                    
                case 8:
                    System.out.println("Exiting");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}