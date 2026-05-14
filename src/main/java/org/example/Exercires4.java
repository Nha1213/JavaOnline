package org.example;

import java.util.Scanner;

public class Exercires4 {
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("event");
        }
        else{
            System.out.println("Odd");
        }
    }
}
