package org.example;

import java.util.Scanner;

public class Exeercise10 {
    static void main() {
        boolean driverAvailable;
        int distance;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter driverAvailable ");
        driverAvailable = input.nextBoolean();
        System.out.print("Enter distance ");
        distance = input.nextInt();

        if(!driverAvailable){
            System.out.println("No  ride available");
        } else if (distance > 30) {
            System.out.println("Ride too far");
        }else {
            System.out.println("Ride too booked");
        }

    }
}
