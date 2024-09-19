/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseriessalise;

/**
 *
 * @author User
 */
public class CommissionEmployee {
    private double totalSales;
    private String empName;
    private int empID;

    public CommissionEmployee() {
    }

    public CommissionEmployee(double totalSales, String empName, int empID) {
        this.totalSales = totalSales;
        this.empName = empName;
        this.empID = empID;
    }

    public CommissionEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }


    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
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
        double totalSalary = 0;
        
        if(this.totalSales < 10000){
            totalSalary = this.totalSales * (.05);
        }else if(this.totalSales >= 10000 && this.totalSales < 100000){
            totalSalary = this.totalSales * (.10);
        }else if(this.totalSales >= 100000 && this.totalSales < 1000000){
            totalSalary = this.totalSales + (.20);
        }else if(this.totalSales >= 1000000){
            totalSalary = this.totalSales * (.30);
        }
        
        
   
        
        return totalSalary;
    }
    
    public void displayCEmployee(){
        String res = String.format("\n-----USING DISPLAY -----\nEMP NAME: %s\nEMP ID: %d\nCOMMISSION: %.2f\nTOTAL COMMISSION: %.2f", this.empName, this.empID, this.totalSales, this.computeSalary());
        System.out.println(res);
    
    }
    
    @Override
    public String toString() {
        return String.format("\n-----USING TO STRING -----\nEMP NAME: %s\nEMP ID: %d\nTOTAL SALES: %.2f\nTOTAL COMMISSION: %.2f", this.empName, this.empID, this.totalSales, this.computeSalary());
    }
    
    
}


