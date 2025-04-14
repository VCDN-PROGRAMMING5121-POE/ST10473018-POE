/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationfeature;

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;
public class RegistrationFeature {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your username: ");
        String userName = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        System.out.print("Enter your cellphone number: ");
        String cellPhoneNumber = scanner.nextLine();

        // Create Login object
        Login login = new Login("Nothando", "Khuzwayo", "Tha1!", "ThaKhu26!", "+27684434138");

        // Check username format
        if (login.checkUserName()) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");
        }

        // Check password complexity using instance method
        boolean isSecure = login.checkPasswordComplexity();
        System.out.println("Password successfully captured " + isSecure);
    
    // Validate phone number
        if (login.checkCellPhoneNumber()) {
            System.out.println("Cell phone number successfully added.");
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
        }
    

    // Login
        System.out.println("Enter your login username: ");
        String enteredUserName = scanner.nextLine();
        System.out.println("Enter your login password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUserName.equals(userName) && enteredPassword.equals(password)) {
            System.out.println("Welcome " + firstName + " " + lastName + ", it is great to see you again.");
        } else {
            System.out.println("Username or password incorrect, please try again.");
        }
    
    scanner.close();
    }
}
