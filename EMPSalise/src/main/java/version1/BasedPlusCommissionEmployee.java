/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

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
        String res = String.format("\n-----USING DISPLAY -----\nEMP NAME: %s\nEMP ID: %d\nTOTAL SALES: %.2f\nBASE SALARY: %.2f\nTOTAL COMMISSION: %.2f", this.empName, this.empID, this.totalSales, this.baseSalary, this.computeSalary());
        System.out.println(res);
    }
    
    
    public double computeSalary(){
        double overallSalary = 0;
        
        if(this.totalSales < 10000){
            overallSalary = this.totalSales * (.05);
        }else if(this.totalSales >= 10000 && this.totalSales < 100000){
            overallSalary = this.totalSales * (.10);
        }else if(this.totalSales >= 100000 && this.totalSales < 1000000){
            overallSalary = this.totalSales * (.20);
        }else if(this.totalSales >= 1000000){
            overallSalary = this.totalSales * (.30);
        }
        
        overallSalary += this.baseSalary;
        
        
        return overallSalary;
    }

    @Override
    public String toString() {
        return String.format("\n-----USING TO STRING -----\nEMP NAME: %s\nEMP ID: %d\nTOTAL SALES: %.2f\nBASE SALARY: %.2f", this.empName, this.empID, this.totalSales, this.baseSalary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    
    
}
