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
        Employee test = new Employee();
        test.setEmpName("George", "Adriane", "Salise");
        test.setEmpID(999);
        test.setDates("2004-12-02", "2012-07-09");
        test.displayEmp();
        System.out.println("\n\n\n\n");
        
        Hourly emp101 = new Hourly(500.0, 8, "George", "Adriane", "Salise", 101, "2004-08-29", "2024-08-29");
        emp101.displayHEmployee();
        System.out.println(emp101.toString());
        System.out.println("\n\n\n\n");
        
        Hourly emp102 = new Hourly(500.0, 9, "George", "Dean", 101, "2004-08-29", "2024-08-29");
        emp102.displayHEmployee();
        System.out.println(emp102.toString());
        
    }
}
