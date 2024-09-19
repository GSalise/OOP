/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salisegeorge;

/**
 *
 * @author acer
 */
public class MyTimeSalise {
    private int day;
    private int hours;
    private int minutes;
    private int seconds;
    private boolean meridian;

    private void setDay(int day) {
        this.day = day>=0 ? day : 0;
    }

    
    public void setHours(int hours) {
        if ((hours <= 12) && (hours >= 0)){
            this.hours = hours;
//            if enabled allows for the seconds and minutes to automatically set to 0 upon entering a new cycle
//            this.minutes=0;
//            this.seconds=0;
        }else{
            this.hours=1;
            this.meridian = !this.meridian;
            if(this.meridian == true){this.setDay(this.day + 1);}
//            if enabled allows for the seconds and minutes to automatically set to 0 upon entering a new cycle
//            this.minutes=0;
//            this.seconds=0;
        }
    }

    public void setMinutes(int minutes) {
        if ((minutes < 60) && (minutes >= 0)){
            this.minutes = minutes;
        }else{
            this.minutes=0;
//            this.seconds=0;
//            if enabled allows for the seconds to automatically set to 0 upon entering a new cycle
            this.setHours(this.hours + 1);
        }
    }

    public void setSeconds(int seconds) {
        if ((seconds < 60) && (seconds >= 0)){
            this.seconds = seconds;
        }else{
            this.seconds=0;
            this.setMinutes(this.minutes + 1);
        }
        
        
    }

    public void setMeridian(String mer) {
        this.meridian = (mer.equalsIgnoreCase("AM"));
    }




    
    
    

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isMeridian() {
        return meridian;
    }
    
    

    
    
    @Override
    public String toString() {
        return String.format("%03d:%02d:%02d:%02d %s", day, hours, minutes, seconds, meridian ? "AM" : "PM");
    }
    
    public void tickbySec() {
        this.setSeconds(this.seconds + 1);
    }
    
    public void tickbyMin(){
        this.setMinutes(this.minutes + 1);
    }
    
    public void tickbyHrs(){
        this.setHours(this.hours + 1);
    }
    
    public void advancetickbySec(int length){
        for(int i=0; i<length; i++){
            this.tickbySec();
        }
    }
    
 


    
    
}
