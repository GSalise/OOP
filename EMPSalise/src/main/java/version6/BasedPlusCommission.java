/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version6;

/**
 *
 * @author User
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

    public BasedPlusCommission(double bs, double totalS, String fName, String lName, int ID) {
        super(totalS, fName, lName, ID);
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
        String res = String.format("""
                                  
                                  -----USING DISPLAYver3 -----
                                  EMP NAME: %s
                                  EMP ID: %d
                                  DOB: %s
                                  HIRED ON: %s
                                  BASE SALARY: %.2f
                                  TOTAL SALES: %.2f
                                  TOTAL SALARY: %.2f""",
               super.getEmpName().toString(), super.getEmpID(), super.getDob(), 
               super.getHireDate(), this.bs, super.getTotalS(), this.computeSalary());
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
                                  BASE SALARY: %.2f
                                  TOTAL SALES: %.2f
                                  TOTAL SALARY: %.2f""",
               super.getEmpName().toString(), super.getEmpID(), super.getDob(), 
               super.getHireDate(), this.bs, super.getTotalS(), this.computeSalary());
    }
    
    
    
    
}
