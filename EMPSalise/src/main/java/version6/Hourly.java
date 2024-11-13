/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version6;


/**
 *
 * @author acer
 */
public class Hourly extends Employee{
    private double rph;
    private float hrsWorked;

    public Hourly() {
    }

    public Hourly(double rph, float hrsWorked, String fName, String mName, String lName, int ID) {
        super(fName, mName, lName, ID);
        this.rph = rph;
        this.hrsWorked = hrsWorked;
    }

    public Hourly(double rph, float hrsWorked, String fName, String mName, String lName, int ID, String dob, String hdate) {
        super(fName, mName, lName, ID, dob, hdate);
        this.rph = rph;
        this.hrsWorked = hrsWorked;
    }
    
    public Hourly(double rph, float hrsWorked, String fName, String lName, int ID, String dob, String hdate) {
        super(fName, lName, ID, dob, hdate);
        this.rph = rph;
        this.hrsWorked = hrsWorked;
    }

    public Hourly(String fName, String mName, String lName) {
        super(fName, mName, lName);
    }

    public Hourly(double rph, float hrsWorked) {
        this.rph = rph;
        this.hrsWorked = hrsWorked;
    }

    public Hourly(double rph, float hrsWorked, String fName, String mName, String lName) {
        super(fName, mName, lName);
        this.rph = rph;
        this.hrsWorked = hrsWorked;
    }

    public Hourly(double rph, float hrsWorked, int empID) {
        super(empID);
        this.rph = rph;
        this.hrsWorked = hrsWorked;
    }
    
    public Hourly(double rph, float hrsWorked, String fName, String lName, int empID) {
        super(fName, lName, empID);
        this.rph = rph;
        this.hrsWorked = hrsWorked;
    }
    
    @Override
    public double computeSalary(){
        return (hrsWorked <= 40) ? rph * hrsWorked : (rph * hrsWorked) * 1.5;
    }
    
    public void displayHEmployee(){
       String res = String.format("""
                                  
                                  -----USING DISPLAYver3 -----
                                  EMP NAME: %s
                                  EMP ID: %d
                                  DOB: %s
                                  HIRED ON: %s
                                  RATE: %.2f
                                  TOTAL HOURS: %.2f
                                  TOTAL SALARY: %.2f""",
               super.getEmpName().toString(), super.getEmpID(), super.getDob(),
               super.getHireDate(), this.rph, this.hrsWorked, this.computeSalary());
       System.out.println(res);
    }

    @Override
    public String toString() {
       return String.format("""
                                  
                                  -----USING DISPLAYver3 -----
                                  EMP NAME: %s
                                  EMP ID: %d
                                  DOB: %s
                                  HIRED ON: %s
                                  RATE: %.2f
                                  TOTAL HOURS: %.2f""",
               super.getEmpName().toString(), super.getEmpID(), super.getDob(),
               super.getHireDate(), this.rph, this.hrsWorked);
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

