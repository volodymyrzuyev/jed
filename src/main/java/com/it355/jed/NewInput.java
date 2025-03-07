package com.it355.jed;

import java.text.Normalizer.Form;
import java.util.*;

public class NewInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DepartmentList deptLI = new DepartmentList();
        FileStorage fileStorage = new FileStorage();
        FileRetreival fileRetrival = new FileRetreival();
        String latestFile = "";

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Salary");
            System.out.println("3. Update Department");
            System.out.println("4. Display Employee Info");
            System.out.println("5. Display Company tree");
            System.out.println("6. Store file");
            System.out.println("7. Restore file");
            System.out.println("8. Exit");
            String choiceStr = scanner.nextLine();
            // STR02J, IDS01J
            choiceStr = java.text.Normalizer.normalize(choiceStr.toUpperCase(Locale.ENGLISH), Form.NFKC);
            // IDS16J
            int choice = Integer.parseInt(choiceStr);
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = scanner.nextLine();
                    System.out.print("Enter Wage: ");
                    double wage = scanner.nextDouble();

                    Employee emp = new Employee(firstName, lastName, id, address, dept, wage);
                    deptLI.addEmployee(emp);
                    System.out.println("Employee added successfully!");
                    break;
                case 2:
                    System.out.print("Enter Employee ID to update salary: ");
                    id = scanner.nextInt();
                    Employee employee = deptLI.findEmployee(id);
                    if (employee != null) {
                        System.out.print("Enter new wage: ");
                        double newWage = scanner.nextDouble();
                        employee.setWage(newWage);
                        System.out.println("Salary updated successfully!");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Employee ID to update department: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    employee = deptLI.findEmployee(id);
                    if (employee != null) {
                        System.out.print("Enter new department: ");
                        String newDptName = scanner.nextLine();
                        employee.setDepartment(newDptName);
                        deptLI.addEmployee(employee);
                        System.out.println("Department updated successfully!");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Employee ID to display info: ");
                    id = scanner.nextInt();
                    employee = deptLI.findEmployee(id);
                    if (employee != null) {
                        System.out.print(employee.toString() + "\n");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Department name: ");
                    System.out.print(deptLI.printTree() + "\n");
                    break;
                case 6:
                    System.out.println("Storing file");
                    latestFile = fileStorage.storeFile(deptLI.allEmps, deptLI.departments);
                    break;
                case 7:
                    System.out.println("Restoring file");
                    fileRetrival.RetreiveEmployees(latestFile);
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
