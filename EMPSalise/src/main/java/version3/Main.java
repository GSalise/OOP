/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author acer
 */
public class Main {
    
    public static void main(String [] args){
        Employee test = new Employee("George", "Salise");
        test.setEmpID(999);
        test.setDob("2004-08-29");
        test.setHireDate("2024-08-29");
        test.displayEmp();
        System.out.println("\n\n\n\n");
        
        Hourly emp101 = new Hourly(500.0, 8, "George", "Adriane", "Salise", 101, "2004-08-29", "2024-08-29");
        emp101.displayHEmployee();
        System.out.println(emp101.toString());
        System.out.println("\n\n\n\n");
        
        Hourly emp102 = new Hourly(500.0, 9, "George", "Dean", 101, "2004-08-29", "2024-08-29");
        emp102.displayHEmployee();
        System.out.println(emp102.toString());
        System.out.println("\n\n\n\n");
        
        PieceWorker testing0 = new PieceWorker(100, 9.5, "PieceWorker", "Employee", 111);
        testing0.displayPieceWorkerEmployee();
        System.out.println(testing0.toString());
        
        Commission testing1 = new Commission(9000.0, "Commission", "Employee", 222);
        testing1.displayCEmployee();
        System.out.println(testing1.toString());
        
        BasedPlusCommission testing2 = new BasedPlusCommission(15000.00, 79856.00, "BasedPlusCommission", "Employee", 333);
        testing2.displayBPCEmployee();
        System.out.println(testing2.toString());
        
        
    }
}
