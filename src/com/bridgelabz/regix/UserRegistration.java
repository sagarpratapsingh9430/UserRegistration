package com.bridgelabz.regix;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    void validPassword(){
        Pattern pattern = Pattern.compile("^[A-Za-z]{8,}$");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()){
            System.out.print("Password is valid: " + password);
        }else {
            System.out.print("Not valid: ");
        }
    }
    public static void main(String[] args) {
        UserRegistration obj = new UserRegistration();

        obj.validPassword();

    }

}
