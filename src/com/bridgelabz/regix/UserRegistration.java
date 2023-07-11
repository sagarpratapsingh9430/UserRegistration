package com.bridgelabz.regix;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    void validPassword(){
        Pattern pattern = Pattern.compile("[a-z]+([+-._]{0,1}[a-z0-9])*@[a-z0-9]+[.][a-z]{2,3}([.]{0,1}[a-z]{2,4})*");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter email sample: ");
        String email = sc.nextLine();
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()){
            System.out.print("Email is valid: " + email);
        }else {
            System.out.print("Not valid: ");
        }
    }
    public static void main(String[] args) {
        UserRegistration obj = new UserRegistration();

        obj.validPassword();

    }

}
