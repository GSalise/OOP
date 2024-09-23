/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package version1;

/**
 *
 * @author User
 */
public class EmployeeSeriesSalise {

    public static void main(String[] args) {
        
        System.out.println("Hourly 1");
        HourlyEmployee emp1 = new HourlyEmployee(42, 10.0, "George", 101);
        System.out.println(emp1.computeSalary());
        emp1.displayHEmployee();
        System.out.println(emp1.toString());
        System.out.println("\n\n\n");
        
        System.out.println("Hourly 2");
        HourlyEmployee emp12 = new HourlyEmployee();
        emp12.setEmpID(102);
        emp12.setEmpName("Shu");
        emp12.setRatePerHour(34.0);
        emp12.setTotalHrsWorked(7);
        emp12.displayHEmployee();
        System.out.println(emp12.toString());
        System.out.println("\n\n\n");
        
        System.out.println("Hourly 3");
        HourlyEmployee emp13 = new HourlyEmployee("Chongyue", 103);
        emp13.setRatePerHour(90.0);
        emp13.setTotalHrsWorked(78);
        emp13.displayHEmployee();
        System.out.println(emp13.toString());
        System.out.println("\n\n\n");
        
        System.out.println("PieceWorker 1");
        PieceWorkerEmployee emp2 = new PieceWorkerEmployee(500, 1.0, 201, "Adriane");
        System.out.println(emp2.computeSalary());
        emp2.displayHourlyEmployee();
        System.out.println(emp2.toString());
        System.out.println("\n\n\n");
        
        System.out.println("PieceWorker 2");
        PieceWorkerEmployee emp22 = new PieceWorkerEmployee();
        emp22.setEmpID(202);
        emp22.setEmpName("Ling");
        emp22.setRatePerPiece(5.0);
        emp22.setTotalPiecesFin(1000);
        emp22.displayHourlyEmployee();
        System.out.println(emp22.toString());
        System.out.println("\n\n\n");
        
        System.out.println("PieceWorker 3");
        PieceWorkerEmployee emp23 = new PieceWorkerEmployee("Dusk", 203);
        emp23.setRatePerPiece(12.0);
        emp23.setTotalPiecesFin(64);
        System.out.println(emp23.computeSalary());
        emp23.displayHourlyEmployee();
        System.out.println(emp23.toString());
        System.out.println("\n\n\n");
        
        
        System.out.println("Commission 1");
        CommissionEmployee emp3 = new CommissionEmployee(10000.0, "Dean", 301);
        emp3.displayCEmployee();
        System.out.println(emp3.toString());
        System.out.println("\n\n\n"); 
        
        System.out.println("Commission 2");
        CommissionEmployee emp32 = new CommissionEmployee();
        emp32.setEmpID(301);
        emp32.setEmpName("Nian");
        emp32.setTotalSales(900.0);
        emp32.displayCEmployee();
        System.out.println(emp32.toString());
        System.out.println("\n\n\n");
        
        System.out.println("Commission 3");
        CommissionEmployee emp33 = new CommissionEmployee("2nd Brother", 303);
        emp33.setTotalSales(9000.0);
        emp33.displayCEmployee();
        System.out.println(emp33.toString());
        System.out.println("\n\n\n");
        
        
        System.out.println("Based Plus Commission 1");
        BasedPlusCommissionEmployee emp4 = new BasedPlusCommissionEmployee(10000.0, 9000, "Peteros", 401);
        System.out.println(emp4.computeSalary());
        emp4.displayBPCEmployee();
        System.out.println(emp4.toString());
        System.out.println("\n\n\n"); 
        
        System.out.println("Based Plus Commission 2");
        BasedPlusCommissionEmployee emp42 = new BasedPlusCommissionEmployee();
        emp42.setEmpID(402);
        emp42.setEmpName("Texas");
        emp42.setTotalSales(900.0);
        emp42.setBaseSalary(300);
        emp42.displayBPCEmployee();
        System.out.println(emp42.toString());
        System.out.println("\n\n\n"); 
        
        System.out.println("Based Plus Commission 3");
        BasedPlusCommissionEmployee emp43 = new BasedPlusCommissionEmployee("Yato", 403);
        emp43.setTotalSales(1000000.0);
        emp43.setBaseSalary(430);
        emp43.displayBPCEmployee();
        System.out.println(emp43.toString());
        System.out.println("\n\n\n"); 
    }
}
