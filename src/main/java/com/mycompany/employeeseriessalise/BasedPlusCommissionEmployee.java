/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseriessalise;

/**
 *
 * @author User
 */
public class BasedPlusCommissionEmployee {
    private double totalSales;
    private double baseSalary;
    private String empName;
    private int empID;

    public BasedPlusCommissionEmployee() {
    }

    public BasedPlusCommissionEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }

    public BasedPlusCommissionEmployee(double totalSales, double baseSalary, String empName, int empID) {
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
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
    
    public void displayBPCEmployee(){
        System.out.println("EMP ID: " + this.getEmpID());
        System.out.println("EMP NAME: " + this.getEmpName());
        System.out.println("EMP Total Sales: " + this.totalSales);
    }
    
    
    public double computeSalary(){
        double overallSalary = 0;
        
        if(this.totalSales < 10000){
            overallSalary = this.totalSales + (this.totalSales * .05);
        }else if(this.totalSales >= 10000 && this.totalSales < 100000){
            overallSalary = this.totalSales + (this.totalSales * .10);
        }else if(this.totalSales >= 100000 && this.totalSales < 1000000){
            overallSalary = this.totalSales + (this.totalSales * .20);
        }else if(this.totalSales >= 1000000){
            overallSalary = this.totalSales + (this.totalSales * .30);
        }
        
        overallSalary += this.baseSalary;
        
        
        return overallSalary;
    }

    @Override
    public String toString() {
        return "EMP Name= " + empName + ", EMP ID=" + empID;
    }
    
    
    
}
