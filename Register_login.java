/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.register_login;

/**
 *
 * @author RC_Student_lab
 */import java.util.Scanner;
public class Register_login {
    public static void main(String[] args) {
        Register signup = new Register();
        Login signin = new Login();
        Scanner scan = new Scanner(System.in);
        
        
        String userName;
        while (true) {
        System.out.println("Please enter Username");
        userName = scan.nextLine();
        if (signup.checkUserName(userName)) {
            System.out.println("Username is valid");
            break;
        }else {
            System.out.println("Username is Invalid,try again");
        }
        }
        
        String password;
        while (true) {
        System.out.println("Please enter your Password");
        password =scan.nextLine();
        if (signup.checkPasswordComplexity(password)) {
            System.out.println("Password is Valid");
            break;
    }else {
            System.out.println("Password is invalid");
        }
        }
        String cellNumber;
        while (true) {
        System.out.println("Please enter your Cell Number");
        cellNumber = scan.nextLine();
        if (signup.checkCellPhoneNumber(cellNumber)) {
            System.out.println("Cell Number is Valid");
            break;
        }else {
            System.out.println("Cell Number is Invalid");
        }
        }
        signin.registerUser(userName, password);
        System.out.println("Registration is successful");
        
        System.out.println("\n Now login with the registered details");
        while (true) {
            System.out.println("Enter Username");
            String loginUsername = scan.nextLine();
            
            System.out.println("Enter Password");
            String loginPassword = scan.nextLine();
            
            if(signin.loginUser(loginUsername, loginPassword)) {
                System.out.println("Welcome " + loginUsername + "!");
                break;
            }else {
                System.out.println("Invalid Username or Password,Please try again");
            }
        }
        
    } 
    
}
