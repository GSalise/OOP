/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author george
 */
public class BasedPlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasedPlusCommissionEmployee() {
    }

    public BasedPlusCommissionEmployee(double baseSalary, double totalSales, String empName, int empID) {
        super(totalSales, empName, empID);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(double baseSalary, double totalSales) {
        super(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(double baseSalary, double totalSales, String empName) {
        super(totalSales, empName);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(double baseSalary, double totalSales, int empID) {
        super(totalSales, empID);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(String empName, int empID) {
        super(empName, empID);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary(){
        return super.computeSalary() + this.baseSalary;
    }
    
    public void displayBPCEmployee(){
        String res = String.format("\n-----USING DISPLAYver2 -----\nEMP NAME: %s\nEMP ID: %d\nTOTAL SALES: %.2f\nBASE SALARY: %.2f\nTOTAL COMMISSION: %.2f", super.getEmpName(), super.getEmpID(), super.getTotalSales(), this.baseSalary, this.computeSalary());
        System.out.println(res);
    }

    @Override
    public String toString() {
        return String.format("\n-----USING DISPLAYver2 -----\nEMP NAME: %s\nEMP ID: %d\nTOTAL SALES: %.2f\nBASE SALARY: %.2f", super.getEmpName(), super.getEmpID(), super.getTotalSales(), this.baseSalary);
    }
    
    
    
}