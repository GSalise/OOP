/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseriessalise;

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
    
    public double computeSalary(){
        double totalSalary;
        double bonus;        
        bonus = this.totalPiecesFin % 100 == 0 ? this.totalPiecesFin/100 : 1;
        System.out.println(bonus);
        totalSalary = (this.totalPiecesFin * this.ratePerPiece) + (bonus * 10);
        
        return totalSalary;
    }
    
    
    
}
