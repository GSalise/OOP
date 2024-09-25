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
    
    public PieceWorker(int pieceFin, double rpp, String fName, String lName, int ID) {
        super(fName, lName, ID);
        this.pieceFin = pieceFin;
        this.rpp = rpp;
    }

    public PieceWorker(int pieceFin, double rpp, String fName, String lName) {
        super(fName, lName);
        this.pieceFin = pieceFin;
        this.rpp = rpp;
    }

    public PieceWorker(int pieceFin, double rpp, int empID) {
        super(empID);
        this.pieceFin = pieceFin;
        this.rpp = rpp;
    }
    
    
    
    
}
    


