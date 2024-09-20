 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accountcars;

/**
 *
 * @author george
 */
public class Account {
    private double currBal=0;
    private double avalBal=0;
    private String acctgName;
    private int acctgNum;

    public Account() {
    }

    public Account(double currBal, double avalBal, String acctgName, int acctgNum) {
        this.currBal = currBal;
        this.avalBal = avalBal;
        this.acctgName = acctgName;
        this.acctgNum = acctgNum;
    }

    public Account(String acctgName, int acctgNum) {
        this.acctgName = acctgName;
        this.acctgNum = acctgNum;
    }

    public Account(double currBal, double avalBal) {
        this.currBal = currBal;
        this.avalBal = avalBal;
    }

    public double getCurrBal() {
        return currBal;
    }

    public void setCurrBal(double currBal) {
        this.currBal = currBal;
    }

    public double getAvalBal() {
        return avalBal;
    }

    public void setAvalBal(double avalBal) {
        this.avalBal = avalBal;
    }

    public String getAcctgName() {
        return acctgName;
    }

    public void setAcctgName(String acctgName) {
        this.acctgName = acctgName;
    }

    public int getAcctgNum() {
        return acctgNum;
    }

    public void setAcctgNum(int acctgNum) {
        this.acctgNum = acctgNum;
    }
    
    
    //+ currbal
    public boolean deposit(double amount){
        if(amount%100==0){
            currBal += amount;
            System.out.println("Success");
            return true;
        }else{
            System.out.println("Fail. Deposit must be atleast 100");
            return false;
        }
    }
    //- avail & curr bal
    public boolean withdraw(double amount){
        if(avalBal > amount && amount%100==0){
            avalBal -= amount;
            currBal -= amount;
            System.out.println("Success");
            return true;
        }else{
            System.out.println("Either insufficient funds or withdrawal is not atleast 100");
            return false;
        }
    }
    
    public void checkBal(){
        String res = String.format("\n--------\nAvailable Balance: %.2f\nCurrent Balance: %.2f\n--------\n", avalBal, currBal);
        System.out.println(res);
    }
    
    public boolean transfer(Account another, double amount){
        if(avalBal > (amount + 10) && amount%100==0){
            avalBal -= (amount - 10);
            currBal -= (amount - 10);
            
            another.currBal += amount;
            
            System.out.println("Success");
            return true;
        }else{
            System.out.println("Either insufficient funds or withdrawal is not atleast 100");
            return false;
        }
    }
    
    public void display(){
        System.out.println(this.toString());
    }
    //match
    public void verify(){
        this.avalBal = this.currBal;
    }

    @Override
    public String toString() {
        return String.format("\n--------\nAccount Name: %s\nAccount ID: %d\nAvailable Balance: %.2f\nCurrent Balance: %.2f\n--------\n", acctgName, acctgNum, avalBal, currBal);
    }
    
    
    
}
