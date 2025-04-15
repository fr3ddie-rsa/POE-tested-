/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.register_login;



/**
 *
 * @author RC_Student_lab
 */import java.util.HashMap;

public class Login {
    private HashMap<String, String> registeredUsers = new HashMap<>();
    
    public void registerUser(String userName, String password) {
        registeredUsers.put(userName, password);
    }
    public boolean loginUser(String userName, String password) {
        if (registeredUsers.containsKey(userName) && registeredUsers.get(userName).equals(password)) {
            return true;
    }else{
            return false;
        }  
    }
}
