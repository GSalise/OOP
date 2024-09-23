/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salisegeorge;

/**
 *
 * @author acer
 */
public class SaliseGeorge {

    public static void main(String[] args) {
        MyTimeSalise t = new MyTimeSalise();
        
        t.setHours(12);
        t.setMinutes(0);
        t.setSeconds(60);
        t.setMeridian("AM");
        System.out.println("Before: " + "\n" + t + "\n");
        //t.tickbySec();
        //t.tickbyMin();
        //t.tickbyHrs();
        //t.advancetickbySec(999999);

        
       System.out.println(t);
    }
}
