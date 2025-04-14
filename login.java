/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationfeature;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    // Attributes (fields)
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String cellPhoneNumber;

    // Constructor
    public Login(String firstName, String lastName, String username, String password, String cellPhoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = username;
        this.password = password;
        this.cellPhoneNumber = cellPhoneNumber;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    // Setter method
    public void setUsername(String username) {
        this.userName = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellPhoneNumber = cellphoneNumber;
    }
    
    // Username validation: contains "_" and <= 5 chars
    public boolean checkUserName() {
        return userName.contains("_") && userName.length() <= 5;
    }

    // Password validation: 8+ chars, upper, number, special char
    public boolean checkPasswordComplexity() {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[^a-zA-Z0-9].*");


    // Phone number validation: +code then up to 10 digits
    public boolean checkCellPhoneNumber() {
        return cellPhoneNumber.matches("^\\+\\d{1,3}\\d{1,10}$");
    }

    // Validate and print feedback for each credential
    public void validateCredentials() {
        if (checkUserName()) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");
        }

        if (checkPasswordComplexity()) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        }

        if (checkCellPhoneNumber()) {
            System.out.println("Cell phone number successfully added.");
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
        }
    }

    // Register user - returns message
    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        } else if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        } else if (!checkCellPhoneNumber()) {
            return "Cell phone number incorrectly formatted or does not contain international code.";
        } else {
            return "User registered successfully!";
        }
    }

    // Login method - check if provided details match stored ones
    public boolean loginUser(String inputUsername, String inputPassword) {
        return this.userName.equals(inputUsername) && this.password.equals(inputPassword);
    }

    // Return login message based on login check
    public String returnLoginStatus(String inputUsername, String inputPassword) {
        if (loginUser(inputUsername, inputPassword)) {
            return "Welcome " + getFirstName() + " " + getLastName() + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}