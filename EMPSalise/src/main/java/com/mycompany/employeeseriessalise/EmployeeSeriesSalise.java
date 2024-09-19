/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeeseriessalise;

/**
 *
 * @author User
 */
public class EmployeeSeriesSalise {

    public static void main(String[] args) {
        
        System.out.println("Hourly");
        HourlyEmployee emp1 = new HourlyEmployee(42, 10.0, "George", 100);
        System.out.println(emp1.computeSalary());
        emp1.displayHEmployee();
        System.out.println(emp1.toString());
        System.out.println("\n\n\n");
        
        
        System.out.println("PieceWorker");
        PieceWorkerEmployee emp2 = new PieceWorkerEmployee(500, 1.0, 200, "Adriane");
        System.out.println(emp2.computeSalary());
        emp2.displayHourlyEmployee();
        System.out.println(emp2.toString());
        System.out.println("\n\n\n");
        
        
        System.out.println("Commission");
        CommissionEmployee emp3 = new CommissionEmployee(10000.0, "Dean", 300);
        System.out.println(emp3.computeSalary());
        emp3.displayCEmployee();
        System.out.println(emp3.toString());
        System.out.println("\n\n\n");
        
        
        System.out.println("Based Plus Commission");
        BasedPlusCommissionEmployee emp4 = new BasedPlusCommissionEmployee(10000.0, 9000, "Peteros", 400);
        System.out.println(emp4.computeSalary());
        emp4.displayBPCEmployee();
        System.out.println(emp4.toString());
        System.out.println("\n\n\n"); 
    }
}
