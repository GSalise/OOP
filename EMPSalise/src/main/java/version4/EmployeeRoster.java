/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version4;
import version3.*;
/**
 *
 * @author User
 */
public class EmployeeRoster {
    private Employee[] empList;
    private int count;
    private int max;
    
    public EmployeeRoster(int max){
        count = 0;
        this.max = max;
        this.empList = new Employee[max];
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Employee[] getEmpList() {
        return empList;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = empList;
    }
    
    
    public boolean addEmployee(Employee e){
        if(this.count < this.max){
            empList[this.count] = e;
            this.count++;
            return true;
        }
        return false;
    }
    
    public Employee removeEmployee(int id){
        int i = 0;
        while(i < this.count && this.getEmpList()[i].getEmpID() != id){
            i++;
        }
        if(i == this.count){
            this.count--;
        }else{
            this.getEmpList()[i] = this.getEmpList()[this.count - 1];
            this.count--;
        }
        return this.getEmpList()[i];
    }
    
    
    public int countHE(){
        int num = 0;
        for(int a = 0; a < this.count; a++){
            num += (this.getEmpList()[a] instanceof Hourly) ? 1 : 0;
            
        }
        return num;
    }
    
    public int countPWE(){
        int num = 0;
        for(int a = 0; a < this.count; a++){
            num += (this.getEmpList()[a] instanceof PieceWorker) ? 1 : 0;
            
        }
        return num;
    }
    
    public int countCE(){
        int num = 0;
        for(int a = 0; a < this.count; a++){
            num += (this.getEmpList()[a] instanceof Commission && !(this.getEmpList()[a] instanceof BasedPlusCommission)) ? 1 : 0;
            
        }
        return num;
    }

    public int countBPCE(){
        int num = 0;
        for(int a = 0; a < this.count; a++){
            num += (this.getEmpList()[a] instanceof BasedPlusCommission) ? 1 : 0;
            
        }
        return num;
    }
    
    
    
    
    
    
    
}
