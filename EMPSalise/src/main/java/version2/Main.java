/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author george
 */
public class Main {
    
    public static void main(String[] args){
        Employee initial = new Employee();
        
        System.out.println("Hourly");
        HourlyEmployee emp1 = new HourlyEmployee(42, 10.0, "George", 100);
        emp1.displayHEmployee();
        System.out.println(emp1.toString());
        System.out.println("\n\n\n");
        
        System.out.println("PieceWorker");
        PieceWorkerEmployee emp2 = new PieceWorkerEmployee(500, 1.0, "Adriane", 200);
        emp2.displayPieceWorkerEmployee();
        System.out.println(emp2.toString());
        System.out.println("\n\n\n");
        
        System.out.println("Commission");
        CommissionEmployee emp3 = new CommissionEmployee(10000.0, "Dean", 300);
        emp3.displayCEmployee();
        System.out.println(emp3.toString());
        System.out.println("\n\n\n");
        
        System.out.println("Based Plus Commission");
        BasedPlusCommissionEmployee emp4 = new BasedPlusCommissionEmployee(9000, 10000.0, "Peteros", 400);
        emp4.displayBPCEmployee();
        System.out.println(emp4.toString());
    }
}
