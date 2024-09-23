/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

/**
 *
 * @author User
 */
public class PieceWorkerEmployee {

    private int totalPiecesFin;
    private double ratePerPiece;
    private int empID;
    private String empName;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int totalPiecesFin, double ratePerPiece, int empID, String empName) {
        this.totalPiecesFin = totalPiecesFin;
        this.ratePerPiece = ratePerPiece;
        this.empID = empID;
        this.empName = empName;
    }

    public PieceWorkerEmployee(String empName, int empID) {
        this.empID = empID;
        this.empName = empName;
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

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

//    PieceWorkerEmployee
//-totalPiecesFinished:int
//-ratePerPiece:double
//-empName:String
//-empID:int
//+computeSalary():double
// -> total pieces fionished * rate per piece
// -> in every hundred pieces finished an aditional bonus of 10*rate per piece
//+displayHourlyEmployee():void
// -> Employee ID: xxx
//    Employee Name: xxx
//+toString():String
// -> similar with display
    public double computeSalary() {
//        double totalSalary;
//        double bonus;        
//        bonus = this.totalPiecesFin % 100 == 0 ? this.totalPiecesFin/100 : 1;
//        totalSalary = (this.totalPiecesFin * this.ratePerPiece) + (bonus * 10);
//        
//        return totalSalary;
        return this.totalPiecesFin * this.ratePerPiece + this.totalPiecesFin / 100 * 10 * this.ratePerPiece;
    }

    public void displayHourlyEmployee() {
//        System.out.println("EMP ID: " + this.getEmpID());
//        System.out.println("EMP NAME: " + this.getEmpName());
//        System.out.println("Rate: " + this.getRatePerPiece());
//        System.out.println("Total Pieces: " + this.getTotalPiecesFin());
//        System.out.println("Total Salary: " + this.computeSalary());

        String res = String.format("\n-----USING DISPLAY -----\nEMP NAME: %s\nEMP ID: %d\nRATE: %.2f\nTOTAL PIECES FINISHED: %d\nTOTAL SALARY: %.2f", this.empName, this.empID, this.ratePerPiece, this.totalPiecesFin, this.computeSalary());
        System.out.println(res);
    }

    @Override
    public String toString() {
        return String.format("\n-----USING TO STRING -----\nEMP NAME: %s\nEMP ID: %d\nRATE: %.2f\nTOTAL PIECES FINISHED: %d", this.empName, this.empID, this.ratePerPiece, this.totalPiecesFin);
    }

}
