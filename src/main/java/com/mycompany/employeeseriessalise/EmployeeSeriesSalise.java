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
        HourlyEmployee emp1 = new HourlyEmployee(42, 10.0, "George", 100);
        System.out.println(emp1.computeSalary());
        emp1.displayHEmployee();
        System.out.println(emp1.toString());
        System.out.println("\n\n\n");
        PieceWorkerEmployee emp2 = new PieceWorkerEmployee(500, 1.0, 200, "Adriane");
        System.out.println(emp2.computeSalary());
        
    }
}
