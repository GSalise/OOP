/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author acer
 */
public class Employee {
    private int empID;
    Name empName;
    Date dates;
    
    public Employee(){
        
    }
    
    public Employee(String fName, String mName, String lName, int ID, String dob, String hdate){
        empName = new Name(fName, mName, lName);
        dates = new Date(dob, hdate);
        empID = ID;
    }
    
    public Employee(String fName, String lName, int ID, String dob, String hdate){
        empName = new Name(fName, lName);
        dates = new Date(dob, hdate);
        empID = ID;
    }
    
    public Employee(String fName, String mName, String lName, int ID){
        empName = new Name(fName, mName, lName);
        empID = ID;
    }
    
    public Employee(String fName, String lName, int ID){
        empName = new Name(fName, lName);
        empID = ID;
    }
    
    public Employee(String fName, String mName, String lName){
        empName = new Name(fName, mName, lName);
    }
    
    public Employee(String fName, String lName){
        empName = new Name(fName, lName);
    }

    public Employee(int empID) {
        this.empID = empID;
    }
    

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void displayEmp() {
        System.out.println(empName.getfName() + " " + empName.getmName().charAt(0) + ". " + empName.getlName() + "\n" + dates.getDob() + " " + dates.getHireDate());
    }

    public Name getEmpName(){
        return empName;
    }

    public void setEmpName(String fName, String mName, String lName) {
        empName = new Name(fName, mName, lName);
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(String dob, String hdate) {
        dates = new Date(dob, hdate);
    }
    
    
    
    
    
}
