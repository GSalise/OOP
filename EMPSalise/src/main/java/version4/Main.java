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
        BasedPlusCommission testing2 = new BasedPlusCommission(15000.00, 79856.00, "BasedPlusCommission", "Employee", 333);
        Commission testing1 = new Commission(9000.0, "Commission", "Employee", 222);
        PieceWorker testing0 = new PieceWorker(100, 9.5, "PieceWorker", "Employee", 111);
        PieceWorker testing9 = new PieceWorker(100, 9.5, "PieceWorker", "Employee", 312);
        PieceWorker testing8 = new PieceWorker(100, 9.5, "PieceWorker", "Employee", 879);
        Commission testing7 = new Commission(9000.0, "Commission", "Employee", 676);
        Commission testing6 = new Commission(9000.0, "Commission", "Employee", 777);
        Hourly testing5 = new Hourly(500.0, 8, "George", "Adriane", "Salise", 999, "2004-08-29", "2024-08-29");
        Hourly testing4 = new Hourly(500.0, 8, "George", "Adriane", "Salise", 888, "2004-08-29", "2024-08-29");

        a.addEmployee(emp101);
        a.addEmployee(testing2);
        a.addEmployee(testing1);
        a.addEmployee(testing9);
        a.addEmployee(testing8);
        a.addEmployee(testing7);
        a.addEmployee(testing6);
        a.addEmployee(testing5);
        a.addEmployee(testing4);

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
    
    }
}
