/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author acer
 */
public class Commission extends Employee{
    private double totalS;

    public Commission() {
    }

    public Commission(double totalS, String fName, String mName, String lName, int ID) {
        super(fName, mName, lName, ID);
        this.totalS = totalS;
    }

    public Commission(double totalS, String fName, String mName, String lName, int ID, String dob, String hdate) {
        super(fName, mName, lName, ID, dob, hdate);
        this.totalS = totalS;
    }

    public Commission(double totalS, int empID) {
        super(empID);
        this.totalS = totalS;
    }

    public Commission(double totalS, String fName, String mName, String lName) {
        super(fName, mName, lName);
        this.totalS = totalS;
    }

    public Commission(String fName, String mName, String lName, int ID) {
        super(fName, mName, lName, ID);
    }

    public Commission(double totalS) {
        this.totalS = totalS;
    }
    
    public double computeSalary(){
        double totalSalary = 0;
        double multiplier;
        
        multiplier = (this.totalS < 10000) ? .05 : 
                (this.totalS >= 10000 && this.totalS < 100000) ? .1 : 
                (this.totalS >= 100000 && this.totalS < 1000000) ? .2 : .3;
        
        return totalSalary = this.totalS * multiplier;
        
    }
    
    public void displayCEmployee(){
        String res = String.format("\n-----USING DISPLAYver3 -----\nEMP NAME: %s\nEMP ID: %d\nCOMMISSION: %.2f\nTOTAL COMMISSION: %.2f", super.getEmpName(), super.getEmpID(), this.totalS, this.computeSalary());
        System.out.println(res);
    }

    @Override
    public String toString() {
        return String.format("\n-----USING DISPLAYver3 -----\nEMP NAME: %s\nEMP ID: %d\nCOMMISSION: %.2f", super.getEmpName(), super.getEmpID(), this.totalS);
    }

    public double getTotalS() {
        return totalS;
    }

    public void setTotalS(double totalS) {
        this.totalS = totalS;
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }
    
    
    
    
    
}
