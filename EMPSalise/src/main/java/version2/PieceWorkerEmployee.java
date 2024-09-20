/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author george
 */
public class PieceWorkerEmployee extends Employee{
    private int totalPiecesFin;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int totalPiecesFin, double ratePerPiece, String empName, int empID) {
        super(empName, empID);
        this.totalPiecesFin = totalPiecesFin;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int totalPiecesFin, double ratePerPiece, String empName) {
        super(empName);
        this.totalPiecesFin = totalPiecesFin;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int totalPiecesFin, double ratePerPiece, int empID) {
        super(empID);
        this.totalPiecesFin = totalPiecesFin;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(String empName, int empID) {
        super(empName, empID);
    }

    public PieceWorkerEmployee(int totalPiecesFin, double ratePerPiece) {
        this.totalPiecesFin = totalPiecesFin;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFin() {
        return totalPiecesFin;
    }

    public void setTotalPiecesFin(int totalPiecesFin) {
        this.totalPiecesFin = totalPiecesFin;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    public double computeSalary(){
        double totalSalary;
        double bonus;        
        bonus = this.totalPiecesFin % 100 == 0 ? this.totalPiecesFin/100 : 1;
        totalSalary = (this.totalPiecesFin * this.ratePerPiece) + (bonus * 10);
        
        return totalSalary;
    }
    
    public void displayPieceWorkerEmployee(){
       String res = String.format("\n-----USING DISPLAYver2 -----\nEMP NAME: %s\nEMP ID: %d\nRATE: %.2f\nTOTAL PIECES FINISHED: %d\nTOTAL SALARY: %.2f", super.getEmpID(), super.getEmpID(), this.ratePerPiece, this.totalPiecesFin, this.computeSalary());
       System.out.println(res);
    }

    @Override
    public String toString() {
        return String.format("\n-----USING DISPLAYver2 -----\nEMP NAME: %s\nEMP ID: %d\nRATE: %.2f\nTOTAL PIECES FINISHED: %d\nTOTAL SALARY: %.2f", super.getEmpID(), super.getEmpID(), this.ratePerPiece, this.totalPiecesFin, this.computeSalary());
    }
    
    
    
    
    
    
    
}
