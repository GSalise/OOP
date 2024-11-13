/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version6;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class EmployeeRosterV3 {
    private ArrayList<Employee> empList;
    
    
    public EmployeeRosterV3(){
        this.empList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }
    
    public void addEmployee(Employee e){
        empList.add(e);
    }
    
    public void removeEmployee(int id){
        int i = 0;
        while( i < this.empList.size() && this.empList.get(i).getEmpID() != id){
            i++;
        }
        
        if(empList.get(i).getEmpID() == id){
            empList.remove(i);
        }
    }
    
    public int countHE(){
        int num = 0;
        for(int a = 0; a < this.empList.size(); a++){
            num += (this.empList.get(a) instanceof Hourly) ? 1 : 0;
            
        }
        return num;
    }
    
    public int countPWE(){
        int num = 0;
        for(int a = 0; a < this.empList.size(); a++){
            num += (this.empList.get(a) instanceof PieceWorker) ? 1 : 0;
            
        }
        return num;
    }
    
    public int countCE(){
        int num = 0;
        for(int a = 0; a < this.empList.size(); a++){
            num += (this.empList.get(a) instanceof Commission && !(this.empList.get(a) instanceof BasedPlusCommission)) ? 1 : 0;
            
        }
        return num;
    }

    public int countBPCE(){
        int num = 0;
        for(int a = 0; a < this.empList.size(); a++){
            num += (this.empList.get(a) instanceof BasedPlusCommission) ? 1 : 0;
            
        }
        return num;
    }
    
    public void displayHE(){
        System.out.println("\nHourly Employees in the current roster: ");
        for(int i = 0; i < this.empList.size(); i++){
            if(this.empList.get(i) instanceof Hourly){
                System.out.print("- ");
                this.empList.get(i).displayEmp();
            }
        }
    }
    
    public void displayPWE(){
        System.out.println("\nPieceWorker Employees in the current roster: ");
        for(int i = 0; i < this.empList.size(); i++){
            if(this.empList.get(i) instanceof PieceWorker){
                System.out.print("- ");
                this.empList.get(i).displayEmp();
            }
        }
    }    
    
    public void displayCE(){
        System.out.println("\nCommission Employees in the current roster: ");
        for(int i = 0; i < this.empList.size(); i++){
            if(this.empList.get(i) instanceof Commission && !(this.empList.get(i) instanceof BasedPlusCommission)){
                System.out.print("- ");
                this.empList.get(i).displayEmp();
            }
        }
    }
    
     public void displayBPCE(){
        System.out.println("\nBased Plus Commission Employees in the current roster: ");
        for(int i = 0; i < this.empList.size(); i++){
            if(this.empList.get(i) instanceof BasedPlusCommission){
                System.out.print("- ");
                this.empList.get(i).displayEmp();
            }
        }
    }
     
    public void displayAllEmployee(){
        System.out.println("\nList of Employees in the current roster\n");
        
        System.out.println(String.format("%-5s | %-30s | %-14s | %-14s | %-12s | %-12s", "EMP ID", "Name", "Hire Date", "Date of Birth","Salary", "EMP Type"));
        for(int i = 0; i < this.empList.size(); i++){
            this.empList.get(i).getClass().getSimpleName();
            String res = String.format("%-6d | %-30s | %-14s | %-14s | %-12.2f | %-12s", this.empList.get(i).getEmpID(), this.empList.get(i).getEmpName(), this.empList.get(i).getHireDate(), this.empList.get(i).getDob(), this.empList.get(i).computeSalary(), this.empList.get(i).getClass().getSimpleName());
            System.out.println(res);
        }
        
        
    }
    
}