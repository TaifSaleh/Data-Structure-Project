/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastrctureproject;

import java.util.Scanner;

//Taif Saleh AlQarni   2111092
//Shada Ibrahim Shafi  2110153
public class Opreation {

    public Node head;

    public void insertEmployee(int ID, String Name, String firstDayOfWork, String phoneNumber, String address, int workHours, double salary) {
        if (!checkRecord(ID)) {
            Node new_node = new Node(ID, Name, firstDayOfWork, phoneNumber, address, workHours, salary);
            if (head == null) {
                head = new_node;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        } else {
            System.out.println("Employee with ID " + ID + " already exist ");
        }
    }

    boolean checkRecord(int ID) {
        Node temp = head;
        if (head == null) {
            return false;
        }

        while (temp != null && head != null) {
            if (temp.ID == ID) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void smartSearch(int ID) {
        Node temp = head;

        if (checkRecord(ID)) {
            System.out.print("--- Employees Information ----\n");
             System.out.print("Employee ID:\t\t");
                System.out.print(temp.ID);
                System.out.print("\n");
                System.out.print("Employee Name:\t\t");
                System.out.print(temp.Name);
                System.out.print("\n");
                System.out.print("First Day of Work:\t");
                System.out.print(temp.firstDayOfWork);
                System.out.print("\n");
                System.out.print("Phone Number:\t\t");
                System.out.print(temp.phoneNumber);
                System.out.print("\n");
                System.out.print("Address:\t\t");
                System.out.print(temp.address);
                System.out.print("\n");
                System.out.print("Work Hours:\t\t");
                System.out.print(temp.workHours);
                System.out.print("\n");
                System.out.print("Salary:\t\t\t");
                System.out.print(temp.salary);
                System.out.print("\n");
                System.out.print("\n");

            return;
        } else {

            System.out.println("Employee doesn't exist");
        }
    }

    public int deleteEmployee(int ID) {

        Node temp = head, prev = null;
        if (temp != null && temp.ID == ID) {
            head = temp.next;
            return 1;
        }
        while (temp != null && temp.ID != ID) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            return 0;
        }
        prev.next = temp.next;
        return 1;
    }

    public void displayAllEmployees() {
        Node temp = head;
        while (temp != null) {
                     System.out.print("--- Employees Information ----\n");
             System.out.print("Employee ID:\t\t");
                System.out.print(temp.ID);
                System.out.print("\n");
                System.out.print("Employee Name:\t\t");
                System.out.print(temp.Name);
                System.out.print("\n");
                System.out.print("First Day of Work:\t");
                System.out.print(temp.firstDayOfWork);
                System.out.print("\n");
                System.out.print("Phone Number:\t\t");
                System.out.print(temp.phoneNumber);
                System.out.print("\n");
                System.out.print("Address:\t\t");
                System.out.print(temp.address);
                System.out.print("\n");
                System.out.print("Work Hours:\t\t");
                System.out.print(temp.workHours);
                System.out.print("\n");
                System.out.print("Salary:\t\t\t");
                System.out.print(temp.salary);
                System.out.print("\n");
                System.out.print("\n");
            temp = temp.next;
        }

    }

    public void updateSalary(int ID) {

        if (!checkRecord(ID)) {
            System.out.println("Employee not found");
        } else {
            Scanner input = new Scanner(System.in);
            double salary = 0;
            int workHours = 0;
            System.out.print("Enter new Salary:");
            salary = input.nextDouble();
            System.out.print("Enter new Work hours:");
            workHours = input.nextInt();
            Node temp = head;
            while (temp != null) {
                if (temp.workHours > 32) {
                    int extraHours = temp.workHours - 32;
                    temp.salary += ((temp.salary * 0.02));
                } 
                 temp = temp.next;
            }
        System.out.println("Record updated succssfully");
        
        }

    }

    public void updateRecored(int ID) {
        if (!checkRecord(ID)) {
            System.out.println("Employee not found");
        } else {
            Scanner input = new Scanner(System.in);
            String Name = "";
            String firstDayOfWork = "";
            String phoneNumber = "";
            String address = "";
            int workHours = 0;
            double salary = 0;
            System.out.print("Enter new employee Name:");
            Name = input.nextLine();
            System.out.print("Enter new First day of work:");
            firstDayOfWork = input.nextLine();
            System.out.print("Enter new Phone number:");
            phoneNumber = input.nextLine();
            System.out.print("Enter new Address:");
            address = input.nextLine();
            System.out.print("Enter new Work hours:");
            workHours = input.nextInt();
            System.out.print("Enter new Salary:");
            salary = input.nextDouble();
            Node temp = head;
            while (temp != null) {
                if (temp.ID == ID) {
                    temp.Name = Name;
                    temp.salary = salary;
                    temp.address = address;
                    temp.firstDayOfWork = firstDayOfWork;
                    temp.workHours = workHours;
                    temp.phoneNumber = phoneNumber;
                }
                temp = temp.next;
            }
        }

    }
}
