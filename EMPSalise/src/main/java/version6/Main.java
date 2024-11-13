/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version6;

/**
 *
 * @author User
 */
public class Main {
    
    public static void main(String [] args){

        
//        Hourly emp101 = new Hourly(500.0, 8, "George", "Adriane", "Salise", 101, "2004-08-29", "2024-08-29");
//        emp101.displayHEmployee();
//        System.out.println(emp101.toString());
//        System.out.println("\n\n\n\n");
//        
//        Hourly emp102 = new Hourly(500.0, 9, "George", "Dean", 101, "2004-08-29", "2024-08-29");
//        emp102.displayHEmployee();
//        System.out.println(emp102.toString());
//        System.out.println("\n\n\n\n");
//        
//        PieceWorker testing0 = new PieceWorker(100, 9.5, "PieceWorker", "Employee", 111);
//        testing0.displayPieceWorkerEmployee();
//        System.out.println(testing0.toString());
//        
//        Commission testing1 = new Commission(9000.0, "Commission", "Employee", 222);
//        testing1.displayCEmployee();
//        System.out.println(testing1.toString());
//        
//        BasedPlusCommission testing2 = new BasedPlusCommission(15000.00, 79856.00, "BasedPlusCommission", "Employee", 333);
//        testing2.displayBPCEmployee();
//        System.out.println(testing2.toString());


        EmployeeRosterV3 a = new EmployeeRosterV3();
        
        Hourly emp101 = new Hourly(500.0, 8, "George", "Adriane", "Salise", 101, "2004-08-29", "2024-08-29");
        Hourly emp102 = new Hourly(500.0, 8, "Chonyue", "Vigil", "Sui", 999, "2004-08-29", "2024-09-29");
        Hourly emp103 = new Hourly(500.0, 8, "Angelina", "Mumu", "Sargon", 888, "2004-08-29", "2024-10-29");
        
        PieceWorker emp104 = new PieceWorker(100, 9.5, "PieceWorker1","Aaa" ,"Employee1", 111, "2004-08-29", "2024-11-29");
        PieceWorker emp105 = new PieceWorker(100, 9.5, "PieceWorker2","Bbb" ,"Employee2", 312, "2004-08-29", "2024-12-29");
        PieceWorker emp106 = new PieceWorker(100, 9.5, "PieceWorker3","Ccc" ,"Employee3", 879, "2004-08-29", "2025-01-29");  
        
        Commission emp107 = new Commission(9000.0, "Commission1","Ddd" ,"Employee1", 222, "2004-08-29", "2025-02-27");
        Commission emp108 = new Commission(9000.0, "Commission2","Eee" ,"Employee2", 676, "2004-08-29", "2025-03-29");
        Commission emp109 = new Commission(9000.0, "Commission3","Fff" ,"Employee3", 777, "2004-08-29", "2025-04-29");

        BasedPlusCommission emp110 = new BasedPlusCommission(15000.00, 79856.00, "BasedPlusCommission","Fff" ,"Employee", 333, "2004-08-29", "2024-08-29");
        
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
        for(int i = 0; i < a.getEmpList().size(); i++){
            System.out.println(a.getEmpList().get(i).toString());
        }
        System.out.println();
        System.out.println();
        System.out.println();
        a.removeEmployee(222);
        for(int i = 0; i < a.getEmpList().size(); i++){
            System.out.println(a.getEmpList().get(i).toString());
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
