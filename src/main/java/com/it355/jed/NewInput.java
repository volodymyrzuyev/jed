package com.it355.jed;

import java.text.Normalizer.Form;
import java.util.*;

public class NewInput {

    /**
     * Main execution function of the program
     */
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
            System.out.println("5. Display Department employees");
            System.out.println("6. Store file");
            System.out.println("7. Restore file");
            System.out.println("8. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                //Add Employee
                case 1:
                    addEmp(scanner, deptLI);
                    break;
                //Update the salary for employee
                case 2:
                    System.out.print("Enter Employee ID to update salary: ");
                    int id = scanner.nextInt();
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
                //Update the department for specified employee
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
                //Display Employee info
                case 4:
                    System.out.print("Enter Employee ID to display info: ");
                    id = scanner.nextInt();
                    employee = deptLI.findEmployee(id);
                    if (employee != null) {
                        System.out.print(employee.toString() + "\n");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    System.out.println("Possible employee actions:");
                    System.out.println("1. Display managment tree");
                    System.out.println("2. Calculate pay.");
                    System.out.println("3. Add employee to manage.");

                    choice = scanner.nextInt();
                    //switch statement for nested actions 
                    switch (choice) {
                        case 1:
                            System.out.println(employee.managmentTree(""));
                            break;
                        case 2:
                            System.out.print("Enter hours worked: ");
                            Double hours = scanner.nextDouble();
                            System.out.println("Employee would be payed " + employee.calculatePay(hours) + "$");
                            break;
                        case 3:
                            Employee newEmp = addEmp(scanner, deptLI);
                            employee.addEmployeeToManage(newEmp);
                            System.out.println("Employee added to management tree");
                            break;
                        default:
                            System.out.println("Invalid option. Try again.");
                    }

                    break;
                //Dispaly department employees
                case 5:
                    System.out.print("Enter Department name: ");
                    scanner.nextLine();
                    String dept = scanner.nextLine();
                    System.out.print(deptLI.getEmployeeList(dept).toString() + "\n");
                    break;
                //Serialize the file
                case 6:
                    System.out.println("Storing file");
                    latestFile = fileStorage.storeFile(deptLI.allEmps, deptLI.departments);
                    break;
                //Deserialize and display
                case 7:
                    System.out.println("Restoring file");
                    ArrayList<Employee> retrievedEmployees = fileRetrival.RetreiveEmployees(latestFile);
                    for(Employee emp : retrievedEmployees)
                    {
                        System.out.println(emp.toString());
                    }
                    break;
                //Exit
                case 8:
                    System.out.println("Exiting");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    /**
     * Adds new employee, and retrun it
     *
     * @param scanner the scanner that will be used
     * @param deptLI  DepartmentList that will be used
     */
    public static Employee addEmp(Scanner scanner, DepartmentList deptLI) {
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
        return emp;
    }
}
