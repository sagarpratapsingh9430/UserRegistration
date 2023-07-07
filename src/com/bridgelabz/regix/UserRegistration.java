package com.bridgelabz.regix;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    void validFirstName(){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstName = sc.nextLine();
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()){
            System.out.print("Valid first name: " + firstName);
        }else {
            System.out.print("Not valid: ");
        }
    }
    void validLastName(){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last name: ");
        String lastName = sc.nextLine();
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()){
            System.out.print("Valid last name: " + lastName);
        }else {
            System.out.print("Not valid: ");
        }
    }
    public static void main(String[] args) {
        UserRegistration obj = new UserRegistration();
        
        obj.validFirstName();
        obj.validLastName();


    }

}
