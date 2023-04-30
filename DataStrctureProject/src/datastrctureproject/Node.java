/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastrctureproject;

//Taif Saleh AlQarni   2111092
//Shada Ibrahim Shafi  2110153

public class Node {

    public int ID;
    public String Name = "";
    public String firstDayOfWork = "";
    public String phoneNumber = "";
    public String address = "";
    public int workHours;
    public double salary;
    public Node next;
    int data;
    public Node head;
    

    public Node(int ID, String Name, String firstDayOfWork, String phoneNumber, String address, int workHours, double salary) {
       
        this.next = null;
        this.ID = ID;
        this.Name = Name;
        this.firstDayOfWork = firstDayOfWork;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.workHours = workHours;
        this.salary = salary;

    }
}
