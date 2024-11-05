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
public class Main {
    public static void main(String [] args){
        EmployeeRoster a = new EmployeeRoster(10);
        
        Hourly emp101 = new Hourly(500.0, 8, "George", "Adriane", "Salise", 101, "2004-08-29", "2024-08-29");
        Hourly emp102 = new Hourly(500.0, 8, "Chonyue", "Vigil", "Sui", 999, "2004-08-29", "2024-08-29");
        Hourly emp103 = new Hourly(500.0, 8, "Angelina", "Mumu", "Sargon", 888, "2004-08-29", "2024-08-29");
        
        PieceWorker emp104 = new PieceWorker(100, 9.5, "PieceWorker1", "Employee1", 111);
        PieceWorker emp105 = new PieceWorker(100, 9.5, "PieceWorker2", "Employee2", 312);
        PieceWorker emp106 = new PieceWorker(100, 9.5, "PieceWorker3", "Employee3", 879);  
        
        Commission emp107 = new Commission(9000.0, "Commission1", "Employee1", 222);
        Commission emp108 = new Commission(9000.0, "Commission2", "Employee2", 676);
        Commission emp109 = new Commission(9000.0, "Commission3", "Employee3", 777);

        BasedPlusCommission emp110 = new BasedPlusCommission(15000.00, 79856.00, "BasedPlusCommission", "Employee", 333);
        
        a.addEmployee(emp101);
        a.addEmployee(emp102);
        a.addEmployee(emp103);
        a.addEmployee(emp104);
        a.addEmployee(emp105);
        a.addEmployee(emp106);
        a.addEmployee(emp107);
        a.addEmployee(emp108);
        a.addEmployee(emp109);
        a.addEmployee(emp110);

        System.out.println();
        System.out.println();
        System.out.println();
        for(int i = 0; i < a.getCount(); i++){
            System.out.println(a.getEmpList()[i].toString());
        }
        System.out.println();
        System.out.println();
        System.out.println();
        a.removeEmployee(222);
        for(int i = 0; i < a.getCount(); i++){
            System.out.println(a.getEmpList()[i].toString());
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println(a.countHE());
        System.out.println(a.countPWE());
        System.out.println(a.countCE());
        System.out.println(a.countBPCE());
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        a.displayHE();
        a.displayPWE();
        a.displayCE();
        a.displayBPCE();
        
        a.displayAllEmployee();
    
    }
}
