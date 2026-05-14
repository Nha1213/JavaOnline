package org.example;

import java.util.Scanner;

public class Exercise9 {
    static void main() {
        boolean isPaid;
        int stock;
        int order;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your stock: ");
        stock = input.nextInt();
        System.out.print("Enter your order: ");
        order = input.nextInt();
        System.out.print("Enter isPaid ");
        isPaid = input.nextBoolean();

        if(!isPaid){
            System.out.println("Sorry, you are not paid or rejected");
        } else if (order > stock) {
            System.out.println("Out of Stock");
        }
        else {
            System.out.println("Order Confirm");
        }
    }
}
