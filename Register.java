/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.register_login;

/**
 *
 * @author RC_Student_lab
 */import java.util.regex.*;
public class Register {

    public Register() {
        
    }
    public boolean checkUserName (String userName) {
        
        return userName.contains("_") && userName.length() >=5;
        
    }
    public boolean checkPasswordComplexity (String password) {
        return password.length() >=8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[0-9].*") &&
                password.matches(".*[!@#$%^&*()_+\\[\\]{};':\"\\\\|,.<>/?].*");
    }
 public boolean checkCellPhoneNumber (String cellNumber) {
     
     String regex="\\+27\\d{9}$|^0[6-8]\\d{8}$";
     Pattern pattern =Pattern.compile(regex);
     Matcher matcher = pattern.matcher(cellNumber);
     return matcher.matches();
 }
       
    
}
