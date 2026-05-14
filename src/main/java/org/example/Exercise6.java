package org.example;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int delivery  = 0;

        System.out.print("Input Distance: ");
        int distance = input.nextInt();
        System.out.print("Input order price: ");
        int order = input.nextInt();

        if(distance <= 5){
            delivery = 2;
        } else if (distance <=15) {
            delivery = 5;
        } else {
            delivery = 10;
        }

        if(order >= 50){
            delivery = 0;
        } else if (distance > 20 && order < 20) {
            order += 3;
        }

        System.out.println("Delivery Price: " + delivery);


    }
}
