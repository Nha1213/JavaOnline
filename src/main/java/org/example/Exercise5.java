package org.example;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number One: ");
        int one = sc.nextInt();
        System.out.print("Enter number Two: ");
        int two = sc.nextInt();
        System.out.print("Enter number Three: ");
        int three = sc.nextInt();

        if(one >= two && one >= three){
            System.out.println(one);
        }
        else if(two >= one && two >= three){
            System.out.println(two);
        }
        else {
            System.out.println(three);
        }
    }
}
