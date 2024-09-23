/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author george
 */
public class HourlyEmployee extends Employee{
   private double ratePerHour;
   private float totalHrsWorked;

    public HourlyEmployee() {
    }
   
    public HourlyEmployee(float totalHrsWorked, double ratePerHour, String empName) {
        super(empName);
        this.ratePerHour = ratePerHour;
        this.totalHrsWorked = totalHrsWorked;
    }

    public HourlyEmployee(float totalHrsWorked, double ratePerHour, String empName, int empID) {
        super(empName, empID);
        this.ratePerHour = ratePerHour;
        this.totalHrsWorked = totalHrsWorked;
    }

    public HourlyEmployee(double ratePerHour, float totalHrsWorked, int empID) {
        super(empID);
        this.ratePerHour = ratePerHour;
        this.totalHrsWorked = totalHrsWorked;
    }

    public HourlyEmployee(String empName, int empID) {
        super(empName, empID);
    }

    public HourlyEmployee(double ratePerHour, float totalHrsWorked) {
        this.ratePerHour = ratePerHour;
        this.totalHrsWorked = totalHrsWorked;
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
       String res = String.format("\n-----USING DISPLAYver2 -----\nEMP NAME: %s\nEMP ID: %d\nRATE: %.2f\nTOTAL HOURS: %.2f\nTOTAL SALARY: %.2f", super.getEmpName(), super.getEmpID(), this.ratePerHour, this.totalHrsWorked, this.computeSalary());
       System.out.println(res);
    }

    @Override
    public String toString() {
        return String.format("\n-----USING DISPLAYver2 -----\nEMP NAME: %s\nEMP ID: %d\nRATE: %.2f\nTOTAL HOURS: %.2f", super.getEmpName(), super.getEmpID(), this.ratePerHour, this.totalHrsWorked);
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHrsWorked() {
        return totalHrsWorked;
    }

    public void setTotalHrsWorked(float totalHrsWorked) {
        this.totalHrsWorked = totalHrsWorked;
    }
    
    

 
   
   
    
}


