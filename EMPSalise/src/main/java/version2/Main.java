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
        
        System.out.println("Hourly 1");
        HourlyEmployee hour1 = new HourlyEmployee(42, 10.0, "George", 101);
        hour1.displayHEmployee();
        System.out.println(hour1.toString());
        System.out.println("\n\n\n");
       
        System.out.println("Hourly 2");
        HourlyEmployee hour2 = new HourlyEmployee();
        hour2.setEmpID(102);
        hour2.setEmpName("Adriane");
        hour2.setRatePerHour(99.0);
        hour2.setTotalHrsWorked(72);
        hour2.displayHEmployee();
        System.out.println(hour2.toString());
        System.out.println("\n\n\n");
        
        System.out.println("Hourly 3");
        HourlyEmployee hour3 = new HourlyEmployee("Dean", 103);
        hour3.setRatePerHour(68.0);
        hour3.setTotalHrsWorked(5);
        hour3.displayHEmployee();
        System.out.println(hour3.toString());
        System.out.println("\n\n\n"); 
         
        System.out.println("Hourly 4");
        HourlyEmployee hour4 = new HourlyEmployee(53.0, 3, 104);
        hour4.setEmpName("Dean");
        hour4.displayHEmployee();
        System.out.println(hour4.toString());
        System.out.println("\n\n\n"); 
        
        System.out.println("Hourly 4");
        HourlyEmployee hour5 = new HourlyEmployee(78, 30, "Peteros");
        hour5.setEmpID(105);
        hour5.displayHEmployee();
        System.out.println(hour5.toString());
        System.out.println("\n\n\n"); 
         
//         System.out.println("Hourly 3");
//         HourlyEmployee emp13 = new HourlyEmployee(6, 900.0, "Clarke");
//         emp13.displayHEmployee();
//         System.out.println(emp13.toString());
//         System.out.println("\n\n\n");
//        
//        System.out.println("PieceWorker 1");
//        PieceWorkerEmployee emp2 = new PieceWorkerEmployee(500, 1.0, "Adriane", 200);
//        emp2.displayPieceWorkerEmployee();
//        System.out.println(emp2.toString());
//        System.out.println("\n\n\n");
//        
//        System.out.println("PieceWorker 2");
//        PieceWorkerEmployee emp22 = new PieceWorkerEmployee();
//        emp22.displayPieceWorkerEmployee();
//        System.out.println(emp22.toString());
//        System.out.println("\n\n\n");
//        
//        System.out.println("PieceWorker 2");
//        PieceWorkerEmployee emp23 = new PieceWorkerEmployee();
//        
//        
//        
//        System.out.println("Commission");
//        CommissionEmployee emp3 = new CommissionEmployee(10000.0, "Dean", 300);
//        emp3.displayCEmployee();
//        System.out.println(emp3.toString());
//        System.out.println("\n\n\n");
//        
//        System.out.println("Based Plus Commission");
//        BasedPlusCommissionEmployee emp4 = new BasedPlusCommissionEmployee(9000, 10000.0, "Peteros", 400);
//        emp4.displayBPCEmployee();
//        System.out.println(emp4.toString());
    }
}
