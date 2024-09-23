/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author george
 */
public class CommissionEmployee extends Employee{
    private double totalSales;

    public CommissionEmployee() {
    }

    public CommissionEmployee(double totalSales, String empName) {
        super(empName);
        this.totalSales = totalSales;
    }

    public CommissionEmployee(double totalSales, String empName, int empID) {
        super(empName, empID);
        this.totalSales = totalSales;
    }

    public CommissionEmployee(double totalSales, int empID) {
        super(empID);
        this.totalSales = totalSales;
    }

    public CommissionEmployee(String empName, int empID) {
        super(empName, empID);
    }

    public CommissionEmployee(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    
    public double computeSalary(){
        double totalSalary = 0;
        double multiplier;
        
        multiplier = (this.totalSales < 10000) ? .05 : 
                (this.totalSales >= 10000 && this.totalSales < 100000) ? .1 : 
                (this.totalSales >= 100000 && this.totalSales < 1000000) ? .2 : .3;
        
        return totalSalary = this.totalSales * multiplier;
        
    }
    
    public void displayCEmployee(){
        String res = String.format("\n-----USING DISPLAYver2 -----\nEMP NAME: %s\nEMP ID: %d\nCOMMISSION: %.2f\nTOTAL COMMISSION: %.2f", super.getEmpName(), super.getEmpID(), this.totalSales, this.computeSalary());
        System.out.println(res);
    
    }

    @Override
    public String toString() {
        return String.format("\n-----USING DISPLAYver2 -----\nEMP NAME: %s\nEMP ID: %d\nCOMMISSION: %.2f", super.getEmpName(), super.getEmpID(), this.totalSales);
    }
    
    
    
    
    
}
