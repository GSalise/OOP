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
        hour4.setEmpName("Peteros");
        hour4.displayHEmployee();
        System.out.println(hour4.toString());
        System.out.println("\n\n\n"); 
        
        System.out.println("Hourly 5");
        HourlyEmployee hour5 = new HourlyEmployee(78, 30, "Salise");
        hour5.setEmpID(105);
        hour5.displayHEmployee();
        System.out.println(hour5.toString());
        System.out.println("\n\n\n"); 
        
        System.out.println("PieceWorker 1");
        PieceWorkerEmployee pw1 = new PieceWorkerEmployee(1000, 10.5, "Shu", 201);
        pw1.displayPieceWorkerEmployee();
        System.out.println(pw1.toString());
        System.out.println("\n\n\n"); 
        
        System.out.println("PieceWorker 2");
        PieceWorkerEmployee pw2 = new PieceWorkerEmployee(50000, 5.0, "Chongyue");
        pw2.setEmpID(202);
        pw2.displayPieceWorkerEmployee();
        System.out.println(pw2.toString());
        System.out.println("\n\n\n"); 
        
        System.out.println("PieceWorker 3");
        PieceWorkerEmployee pw3 = new PieceWorkerEmployee(482, 8.9, 203);
        pw3.setEmpName("Ling");
        pw3.displayPieceWorkerEmployee();
        System.out.println(pw3.toString());
        System.out.println("\n\n\n"); 
        
        System.out.println("PieceWorker 4");
        PieceWorkerEmployee pw4 = new PieceWorkerEmployee("Dusk", 104);
        pw4.setRatePerPiece(9.0);
        pw4.setTotalPiecesFin(533);
        pw4.displayPieceWorkerEmployee();
        System.out.println(pw4.toString());
        System.out.println("\n\n\n"); 
        
        System.out.println("PieceWorker 5");
        PieceWorkerEmployee pw5 = new PieceWorkerEmployee(550, 7.0);
        pw5.setEmpID(205);
        pw5.setEmpName("Nian");
        pw5.displayPieceWorkerEmployee();
        System.out.println(pw5.toString());
        System.out.println("\n\n\n"); 
        
        System.out.println("Commission 1");
        CommissionEmployee cm1 = new CommissionEmployee(5000, "Dodo", 301);
        cm1.displayCEmployee();
        System.out.println(cm1.toString());
        System.out.println("\n\n\n"); 
        
        System.out.println("Commission 2");
        CommissionEmployee cm2 = new CommissionEmployee(5000, "wswAS");
        cm2.setEmpID(302);
        cm2.displayCEmployee();
        System.out.println(cm2.toString());
        System.out.println("\n\n\n");
        
        System.out.println("Commission 3");
        CommissionEmployee cm3 = new CommissionEmployee(5000, 303);
        cm3.setEmpName("hhaahahjah");
        cm3.displayCEmployee();
        System.out.println(cm3.toString());
        System.out.println("\n\n\n");
        
        System.out.println("Commission 4");
        CommissionEmployee cm4 = new CommissionEmployee("eWEFERWF", 304);
        cm4.setTotalSales(790700);
        cm4.displayCEmployee();
        System.out.println(cm4.toString());
        System.out.println("\n\n\n");
        
        System.out.println("Commission 5");
        CommissionEmployee cm5 = new CommissionEmployee();
        cm5.setEmpID(305);
        cm5.setEmpName("fdasf");
        cm5.setTotalSales(9000);
        cm5.displayCEmployee();
        System.out.println(cm5.toString());
        System.out.println("\n\n\n");
        
        System.out.println("Based Plus Commission 1");
        BasedPlusCommissionEmployee bpc1 = new BasedPlusCommissionEmployee(500.0, 900.0, "sdsdsd", 401);
        bpc1.displayBPCEmployee();
        System.out.println(bpc1.toString());
        System.out.println("\n\n\n");
        
        System.out.println("Based Plus Commission 2");
        BasedPlusCommissionEmployee bpc2 = new BasedPlusCommissionEmployee(100.0, 100.0);
        bpc2.setEmpID(402);
        bpc2.setEmpName("asdasd");
        bpc2.displayBPCEmployee();
        System.out.println(bpc2.toString());
        System.out.println("\n\n\n");
        
        System.out.println("Based Plus Commission 3");
        BasedPlusCommissionEmployee bpc3 = new BasedPlusCommissionEmployee(7900.0, 77700.0, "ssadwwwwwe");
        bpc3.setEmpID(403);
        bpc3.displayBPCEmployee();
        System.out.println(bpc1.toString());
        System.out.println("\n\n\n");
        
        System.out.println("Based Plus Commission 4");
        BasedPlusCommissionEmployee bpc4 = new BasedPlusCommissionEmployee(9900.0, 99900.0, 404);
        bpc4.setEmpName("aaaaaaa");
        bpc4.displayBPCEmployee();
        System.out.println(bpc4.toString());
        System.out.println("\n\n\n");
        
        System.out.println("Based Plus Commission 5");
        BasedPlusCommissionEmployee bpc5 = new BasedPlusCommissionEmployee();
        bpc5.setEmpID(405);
        bpc5.setEmpName("saaaaaaa");
        bpc5.setTotalSales(100000);
        bpc5.setBaseSalary(9000);
        bpc5.displayBPCEmployee();
        System.out.println(bpc5.toString());
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
