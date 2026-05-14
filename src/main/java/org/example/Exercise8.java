package org.example;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary;
        System.out.print("Enter Salary: ");
        salary = input.nextDouble();

        double tax, taxAmount,total;

        if(salary <= 1000){
            tax = 0;
            total = salary;
            taxAmount = 0;
        } else if (salary <=3000) {
            tax = 10;
            taxAmount = salary * 0.1;
            total = salary - taxAmount;
        }else if (salary <=5000) {
            tax = 15;
            taxAmount = salary * 0.15;
            total = salary - taxAmount;
        }
        else  {
            tax = 20;
            taxAmount = salary * 0.20;
            total = salary - taxAmount;
        }
        System.out.println("Tax: " + taxAmount);
        System.out.println("Tax Amount: " + total);
    }
}
