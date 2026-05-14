package org.example;

import java.util.Scanner;

public class PositiveorNegative {
    void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        if(num < 0) {
            System.out.println("Negative number");
        } else if (num == 0) {
            System.out.println("Zero");
        }
        else  {
            System.out.println("Positive number");

        }
    }
}
