/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseriessalise;

/**
 *
 * @author User
 */
public class HourlyEmployee {
    private float totalHrsWorked;
    private double ratePerHour;
    private String empName;
    private int empID;
   
    public HourlyEmployee() {
    }

    public HourlyEmployee(float totalHrsWorked, double ratePerHour, String empName, int empID) {
        this.totalHrsWorked = totalHrsWorked;
        this.ratePerHour = ratePerHour;
        this.empName = empName;
        this.empID = empID;
    }
    
    

    public float getTotalHrsWorked() {
        return totalHrsWorked;
    }

    public void setTotalHrsWorked(float totalHrsWorked) {
        this.totalHrsWorked = totalHrsWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    
    public double computeSalary(){
        double totalSalary;
        if(totalHrsWorked <= 40){
            totalSalary = this.ratePerHour * this.totalHrsWorked;
        }else{
            totalSalary =  + (this.ratePerHour * this.totalHrsWorked) * 1.5;
        }
        return totalSalary;
    }
    
    public void displayHEmployee(){
        System.out.println("EMP ID: " + this.getEmpID());
        System.out.println("EMP NAME: " + this.getEmpName());
    }

    @Override
    public String toString() {
        return "EMP Name=" + empName + ", EMP ID=" + empID;
    }
    
    
}
