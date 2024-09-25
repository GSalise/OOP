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
    Name empName = new Name();
    
    
    public Employee(){
        
    }
    
    public Employee(String fName, String lName, int ID){
        empName.setfName(fName);
        empName.setlName(lName);
        empID = ID;
    }
    
    public Employee(String fName, String lName){
        empName.setfName(fName);
        empName.setlName(lName);
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

    public void displayEmpName() {
        System.out.println(empName.getfName() + " " + empName.getlName());
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(String fName, String lName) {
        empName.setfName(fName);
        empName.setlName(lName);
    }
    
    
    
}
