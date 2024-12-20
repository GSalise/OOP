/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version7;

/**
 *
 * @author User
 */
public class Name {
    private String fName;
    private String mName;
    private String lName;

    public Name(String fName, String mName, String lName) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }
    
    public Name(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public Name() {
    }
    

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
    
    public void displayName(){
        String res = String.format("%s%s %s", this.fName, (this.mName != null) ? " " + this.mName.charAt(0) : "", this.lName);
        System.out.println(res);
    }
    
    @Override
    public String toString(){
        return String.format("%s%s %s", this.fName, (this.mName != null) ? " " + this.mName.charAt(0) : "", this.lName);
    }
    
    
    
    
}