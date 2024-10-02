/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author acer
 */
public class PieceWorker extends Employee{
    private int pieceFin;
    private double rpp;

    public PieceWorker() {
    }
    
    public PieceWorker(int pieceFin, double rpp, String fName, String mName, String lName, int ID) {
        super(fName, mName, lName, ID);
        this.pieceFin = pieceFin;
        this.rpp = rpp;
    }

    public PieceWorker(int pieceFin, double rpp, String fName, String mName, String lName, int ID, String dob, String hdate) {
        super(fName, mName, lName, ID, dob, hdate);
        this.pieceFin = pieceFin;
        this.rpp = rpp;
    }

    public PieceWorker(int pieceFin, double rpp, String fName, String mName, String lName) {
        super(fName, mName, lName);
        this.pieceFin = pieceFin;
        this.rpp = rpp;
    }

    public PieceWorker(int pieceFin, double rpp, int empID) {
        super(empID);
        this.pieceFin = pieceFin;
        this.rpp = rpp;
    }

    public PieceWorker(int pieceFin, double rpp) {
        this.pieceFin = pieceFin;
        this.rpp = rpp;
    }
    
    public double computeSalary(){
        double totalSalary;
        double bonus;        
        bonus = this.pieceFin % 100 == 0 ? this.pieceFin/100 : 1;
        totalSalary = (this.rpp * this.rpp) + (bonus * 10);
        
        return totalSalary; 
    }
    
    public void displayPieceWorkerEmployee(){
       String res = String.format("\n-----USING DISPLAYver3 -----\nEMP NAME: %s\nEMP ID: %d\nRATE: %.2f\nTOTAL PIECES FINISHED: %d\nTOTAL SALARY: %.2f", super.getEmpID(), super.getEmpID(), this.rpp, this.pieceFin, this.computeSalary());
       System.out.println(res);
    }

    @Override
    public String toString() {
        return String.format("\n-----USING DISPLAYver3 -----\nEMP NAME: %s\nEMP ID: %d\nRATE: %.2f\nTOTAL PIECES FINISHED: %d", super.getEmpID(), super.getEmpID(), this.rpp, this.pieceFin);
    }

    public int getPieceFin() {
        return pieceFin;
    }

    public void setPieceFin(int pieceFin) {
        this.pieceFin = pieceFin;
    }

    public double getRpp() {
        return rpp;
    }

    public void setRpp(double rpp) {
        this.rpp = rpp;
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }
    
    
    
    
}
    


