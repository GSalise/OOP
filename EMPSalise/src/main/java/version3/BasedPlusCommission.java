/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author acer
 */
public class BasedPlusCommission extends Commission{
    private double bs;

    public BasedPlusCommission() {
    }

    public BasedPlusCommission(String fName, String mName, String lName, int ID) {
        super(fName, mName, lName, ID);
    }

    public BasedPlusCommission(double bs, double totalS, String fName, String mName, String lName, int ID, String dob, String hdate) {
        super(totalS, fName, mName, lName, ID, dob, hdate);
        this.bs = bs;
    }

    public BasedPlusCommission(double bs, double totalS) {
        super(totalS);
        this.bs = bs;
    }

    public BasedPlusCommission(double bs, double totalS, String fName, String mName, String lName, int ID) {
        super(totalS, fName, mName, lName, ID);
        this.bs = bs;
    }

    public BasedPlusCommission(double bs) {
        this.bs = bs;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + this.bs;
    }
    
    public void displayBPCEmployee(){
        String res = String.format("\n-----USING DISPLAYver3 -----\nEMP NAME: %s\nEMP ID: %d\nTOTAL SALES: %.2f\nBASE SALARY: %.2f\nTOTAL COMMISSION: %.2f", super.getEmpName(), super.getEmpID(), super.getTotalS(), this.bs, this.computeSalary());
        System.out.println(res);
    }

    @Override
    public String toString() {
        return String.format("\n-----USING DISPLAYver3 -----\nEMP NAME: %s\nEMP ID: %d\nTOTAL SALES: %.2f\nBASE SALARY: %.2f", super.getEmpName(), super.getEmpID(), super.getTotalS(), this.bs);
    }
    
    
    
    
}
