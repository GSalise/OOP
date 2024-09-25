/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author acer
 */
public class Hourly extends Employee{
    private double rph;
    private float hrsWorked;

    public Hourly() {
    }

    public Hourly(double rph, float hrsWorked, String fName, String lName, int ID) {
        super(fName, lName, ID);
        this.rph = rph;
        this.hrsWorked = hrsWorked;
    }

    public Hourly(double rph, float hrsWorked, String fName, String lName, int ID, String dob, String hdate) {
        super(fName, lName, ID, dob, hdate);
        this.rph = rph;
        this.hrsWorked = hrsWorked;
    }

    public Hourly(String fName, String lName) {
        super(fName, lName);
    }

    public Hourly(double rph, float hrsWorked) {
        this.rph = rph;
        this.hrsWorked = hrsWorked;
    }

    public Hourly(double rph, float hrsWorked, String fName, String lName) {
        super(fName, lName);
        this.rph = rph;
        this.hrsWorked = hrsWorked;
    }

    public Hourly(double rph, float hrsWorked, int empID) {
        super(empID);
        this.rph = rph;
        this.hrsWorked = hrsWorked;
    }
    
    public double computeSalary(){
        return (hrsWorked <= 40) ? rph * hrsWorked : (rph * hrsWorked) * 1.5;
    }
    
     public void displayHEmployee(){
       String res = String.format("\n-----USING DISPLAYver3 -----\nEMP NAME: %s\nEMP ID: %d\nRATE: %.2f\nTOTAL HOURS: %.2f\nTOTAL SALARY: %.2f", super.getEmpName(), super.getEmpID(), this.rph, this.hrsWorked, this.computeSalary());
       System.out.println(res);
    }

    @Override
    public String toString() {
        return String.format("\n-----USING DISPLAYver3 -----\nEMP NAME: %s\nEMP ID: %d\nRATE: %.2f\nTOTAL HOURS: %.2f", super.getEmpName(), super.getEmpID(), this.rph, this.hrsWorked);
    }

    public double getRph() {
        return rph;
    }

    public void setRph(double rph) {
        this.rph = rph;
    }

    public float getHrsWorked() {
        return hrsWorked;
    }

    public void setHrsWorked(float hrsWorked) {
        this.hrsWorked = hrsWorked;
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }
     
    
    
    
}
