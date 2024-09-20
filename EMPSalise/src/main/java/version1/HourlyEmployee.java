/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

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
    
    public HourlyEmployee(String empName, int empID){
        this.empID = empID;
        this.empName = empName;
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
       String res = String.format("\n-----USING DISPLAY -----\nEMP NAME: %s\nEMP ID: %d\nRATE: %.2f\nTOTAL HOURS: %.2f\nTOTAL SALARY: %.2f", this.empName, this.empID, this.ratePerHour, this.totalHrsWorked, this.computeSalary());
       System.out.println(res);
    }

    @Override
    public String toString() {
        return String.format("\n-----USING TO STRING -----\nEMP NAME: %s\nEMP ID: %d\nRATE: %.2f\nTOTAL HOURS: %.2f\nTOTAL SALARY: %.2f", this.empName, this.empID, this.ratePerHour, this.totalHrsWorked, this.computeSalary());
    }
    
    
}
