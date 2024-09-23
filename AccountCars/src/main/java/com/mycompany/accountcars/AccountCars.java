/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.accountcars;

/**
 *
 * @author george
 */
public class AccountCars {

    public static void main(String[] args) {
        Account a1 = new Account("George", 100);
        Account a2 = new Account("Adriane", 200);
        
        
        a1.deposit(500);
        a2.deposit(500);
        a1.display();
        System.out.println(a2.toString());
        a1.verify();
        a2.verify();
        a1.withdraw(100);
        a2.withdraw(100);
        a1.display();
        a2.display();
        a1.transfer(a2, 100);
        a1.checkBal();
        a2.checkBal();
        
        System.out.println("\n\n\n");
        
        Cars c1 = new Cars(50, "Red", "Buggati", "Veyron", "3atmy455");
        c1.display();
        c1.accelerate();
        c1.decelerate();
        c1.decelerate();
        c1.decelerate();
        c1.display();
        c1.accelerate();
        c1.accelerate();
        c1.display();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        System.out.println("--");
        System.out.println(c1.toString());
        c1.accelerate();
        System.out.println("--");
        c1.decelerate();
        c1.accelerate();
        c1.decelerate();
        System.out.println(c1.toString());
        
    }
}
