/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accountcars;

/**
 *
 * @author george
 */
public class Cars {
    private int topSpeed;
    private int currSpeed = 0;
    private String color;
    private String manafacturer;
    private String model;
    private String plateNum;
    private boolean isDisabled = false;

    public Cars() {
    }

    public Cars(String color, String model, String plateNum) {
        this.color = color;
        this.model = model;
        this.plateNum = plateNum;
    }

    public Cars(int topSpeed, String color, String manafacturer, String model, String plateNum) {
        this.topSpeed = topSpeed;
        this.color = color;
        this.manafacturer = manafacturer;
        this.model = model;
        this.plateNum = plateNum;
    }
    
    

    public Cars(int topSpeed, String model) {
        this.topSpeed = topSpeed;
        this.model = model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }
    
    public String getManafacturer() {
        return manafacturer;
    }

    public void setManafacturer(String manafacturer) {
        this.manafacturer = manafacturer;
    }
    
    public boolean accelerate(){
        if (!isDisabled && (currSpeed + 10) <= topSpeed){
            currSpeed += 10;
            System.out.println(String.format("The %s %s %s whose plate number is %s has accelerated and is currently moving at %dkph", color, manafacturer, model, plateNum, currSpeed));
            return true;
        }else{
            if((currSpeed + 10) > topSpeed){
                currSpeed = 0;
                isDisabled = true;
                System.out.println(String.format("The %s %s %s whose plate number is %s has encountered a terrible crash due to speeding", color, manafacturer, model, plateNum));
            }else{
                System.out.println(String.format("Your car is whack!"));
            }
            return false;
        }
        
    }
    
    public boolean decelerate(){
        if(!isDisabled && currSpeed != 0){
            currSpeed -= 10;
            System.out.println(String.format("The %s %s %s whose plate number is %s has deccelerated and is currently moving at %dkph", color, manafacturer, model, plateNum, currSpeed));
            return true;
        }else{
            if(currSpeed == 0 && !isDisabled){
                System.out.println(String.format("The %s %s %s whose plate number is %s is currently not moving", color, manafacturer, model, plateNum));
            }else{
                System.out.println(String.format("Your car is whack!"));
            }
            return false;
        }
    }
    
    public void display(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return (!isDisabled && currSpeed != 0) ? String.format("The %s %s %s whose plate number is %s is currently moving at %dkph", color, manafacturer, model, plateNum, currSpeed)
                : (!isDisabled) ? String.format("The %s %s %s whose plate number is %s is currently not moving", color, manafacturer, model, plateNum)
                : String.format("Your car is whack!");
    }



    
    
 
    
    
    
    
}
