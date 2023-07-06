package com.bridgelabz.regix;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    void validFirstName(){
        Pattern pattern = Pattern.compile("[^A-Z][a-zA-Z][0-9]*$");
        Pattern pattern1 = Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$");
        Pattern pattern2 = Pattern.compile("^[9][1]\s[6-9][0-9]{9}$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstName = sc.nextLine();
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()){
            System.out.println("First name is valid: ");
        }else {
            System.out.println("First name is not valid: ");
        }

    }

}
