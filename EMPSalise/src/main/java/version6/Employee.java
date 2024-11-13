/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version6;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public abstract class Employee {
    private int empID;
    Name empName;
    private LocalDate dob;
    private LocalDate hireDate;
    
    public Employee(){
        
    }
    
    public Employee(String fName, String mName, String lName, int ID, String dob, String hdate){
        empName = new Name(fName, mName, lName);
        this.dob = LocalDate.parse(dob);
        this.hireDate = LocalDate.parse(hdate);
        empID = ID;
    }
    
    public Employee(String fName, String lName, int ID, String dob, String hdate){
        empName = new Name(fName, lName);
        this.dob = LocalDate.parse(dob);
        this.hireDate = LocalDate.parse(hdate);
        empID = ID;
    }
    
    public Employee(String fName, String mName, String lName, int ID){
        empName = new Name(fName, mName, lName);
        empID = ID;
    }
    
    public Employee(String fName, String lName, int ID){
        empName = new Name(fName, lName);
        empID = ID;
    }
    
    public Employee(String fName, String mName, String lName){
        empName = new Name(fName, mName, lName);
    }
    
    public Employee(String fName, String lName){
        empName = new Name(fName, lName);
    }

    public Employee(int empID) {
        this.empID = empID;
    }
    

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void displayEmp() {
        System.out.println(this.empName.toString());
    }

    public Name getEmpName(){
        return empName;
    }

    public void setEmpName(String fName, String mName, String lName) {
        empName = new Name(fName, mName, lName);
    }


    public LocalDate getDob() {
        return dob;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
    

    public void setDob(String dob) {
        this.dob = LocalDate.parse(dob);
    }

    public void setHireDate(String hireDate) {
        this.hireDate = LocalDate.parse(hireDate);
    }
    
    
    public abstract double computeSalary();
    
    
    
    
}

