/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author User
 */
import java.time.LocalDate;
public class Date {
    private LocalDate dob;
    private LocalDate hireDate;

    public LocalDate getDob() {
        return dob;
    }
   
    public void setDob(String dob) {
        this.dob = LocalDate.parse(dob);
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = LocalDate.parse(hireDate);
    }

    public Date(String dob, String hireDate) {
        this.dob = LocalDate.parse(dob);
        this.hireDate = LocalDate.parse(hireDate);
    }
    
    
    
    
}
