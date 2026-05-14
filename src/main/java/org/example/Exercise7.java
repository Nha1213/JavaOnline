package org.example;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int attempts = 0;
        boolean isattempt =  true;
        while (isattempt) {
            System.out.print("Input username: ");
            String username = input.nextLine();
            System.out.print("Input password: ");
            String password = input.nextLine();

            if("admin".equals(username) && "admin".equals(password)) {
                System.out.println("You have successfully logged in!");
            }else if ("admin".equals(username) && !"admin".equals(password)) {
                System.out.println("Passwords don't match!");
            } else {
                attempts++;
                if(attempts >= 3) {
                    System.out.println("You have failed to log in!");
                    isattempt = false;
                }
                else {
                    System.out.println("Login failed!");
                }
            }

        }


    }
}
