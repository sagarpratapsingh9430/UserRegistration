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
            System.out.println("Valid first name: " + firstName);
        }else {
            System.out.println("Not valid: ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to user registration: ");
        System.out.println();
        UserRegistration obj = new UserRegistration();
        obj.validFirstName();

    }

}
