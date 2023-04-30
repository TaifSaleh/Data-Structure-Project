/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastrctureproject;

import java.util.Scanner;

//Taif Saleh AlQarni   2111092
//Shada Ibrahim Shafi  2110153 

public class DataStrctureProject {

    public static void main(String[] args) throws Exception {
        Node head = null;
        int ID = 0;
        int workHours;
        double salary = 0;
        String Name = "";
        String firstDayOfWork = "";
        String phoneNumber = "";
        String address = "";
        Scanner input = new Scanner(System.in);
        Opreation op = new Opreation();

        while (true) {
            System.out.print("\n\t\t****The Employee Management System****\n"
                    + "\nEnter a number to choose: \n"
                    + "\t (1) Create a new employee record.\n"
                    + "\t (2) Delete an employee record.\n"
                    + "\t (3) Update an employee record.\n"
                    + "\t (4) Show employees' records.\n" + "\t "
                    + "(5) To use smartSearch.\n"
                    + "\t (6) Update employees salaries.\n"
                    + "\t (7) Exit the system.\n");
            System.out.print("\nEnter your choice: ");
            int Choice = input.nextInt();

            switch (Choice) {
                case 1:
                    System.out.println("Enter employee ID: ");
                    ID = input.nextInt();
                    System.out.println("Enter name of employee: ");
                    Name = input.next();
                    System.out.println("Enter first day of work: ");
                    firstDayOfWork = input.next();
                    System.out.println("Enter phone number: ");
                    phoneNumber = input.next();
                    System.out.println("Enter address: ");
                    address = input.next();
                    System.out.print("Enter working hours: ");
                    workHours = input.nextInt();
                    while (workHours < 32) {
                        System.out.println("32 hours are required for every employee.");
                        System.out.print("\n");
                        System.out.println("Enter working hours:");
                        workHours = input.nextInt();

                    }
                    System.out.println("Enter employee's salary:");
                    salary = input.nextDouble();
                    op.insertEmployee(ID, Name, firstDayOfWork, phoneNumber, address, workHours, salary);
                    System.out.print("\nEmployee inserted successfully!");
                    System.out.print("\n");
                    break;
                case 2:
                    System.out.println("Enter employee record ID to delete: ");
                    ID = input.nextInt();
                    op.deleteEmployee(ID);
                    System.out.print("\nEmployee information deleted successfully!");
                    break;
                case 3:
                    System.out.println("Enter employee record ID to update:  ");
                    ID = input.nextInt();
                    op.updateRecored(ID);
                    op.smartSearch(ID);
                    System.out.print("\nEmployee information updated successfully!");
                    break;
                case 4:
                    op.displayAllEmployees();
                    break;
                case 5:
                    System.out.println("Enter employee ID:  ");
                    ID = input.nextInt();
                    op.smartSearch(ID);
                    break;
                case 6:
                    System.out.println("Enter employee ID:  ");
                    ID = input.nextInt();
                    op.updateSalary(ID);
                    System.out.print("\nSalary updated successfully!");
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.print("Invalid choice, please try again\n");
                    break;
            }
        }
    }
}
