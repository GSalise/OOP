/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version6;

/**
 *
 * @author User
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

    public PieceWorker(int pieceFin, double rpp, String fName, String lName, int ID) {
        super(fName, lName, ID);
        this.pieceFin = pieceFin;
        this.rpp = rpp;
    }
    
    
    @Override
    public double computeSalary(){
        double totalSalary;
        double bonus;        
        bonus = this.pieceFin % 100 == 0 ? this.pieceFin/100 : 1;
        totalSalary = (this.rpp * this.rpp) + (bonus * 10);
        
        return totalSalary; 
    }
    
    public void displayPieceWorkerEmployee(){
       String res = String.format("""
                                  
                                  -----USING DISPLAYver3 -----
                                  EMP NAME: %s
                                  EMP ID: %d
                                  DOB: %s
                                  HIRED ON: %s
                                  PIECES FINISHED: %d
                                  RATE PER PIECE: %.2f
                                  TOTAL SALARY: %.2f""", 
               super.getEmpName().toString(), super.getEmpID(), super.getDob(), 
               super.getHireDate(), this.pieceFin, this.rpp, this.computeSalary());
       System.out.println(res);
    }

    @Override
    public String toString() {
        return String.format("""
                             
                             -----USING TOSTRINGver3 -----
                             EMP NAME: %s
                             EMP ID: %d
                             DOB: %s
                             HIRED ON: %s
                             PIECES FINISHED: %d
                             RATE PER PIECE: %.2f""",
                super.getEmpName().toString(), super.getEmpID(), super.getDob(), 
               super.getHireDate(), this.pieceFin, this.rpp);
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
