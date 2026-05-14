package org.example;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.Scanner;

public class Exeerxise2 {
    void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int Network, DAS, DS;

        System.out.print("Enter Network number: ");
        Network = input.nextInt();
        System.out.print("Enter DAS number: ");
        DAS = input.nextInt();
        System.out.print("Enter DS number: ");
        DS = input.nextInt();

        int total = Network + DAS + DS;

        double AVG = (double)total/  3;

        if(AVG >= 90 && AVG <= 100) {
            System.out.println("Average is Pass A: " + AVG);
        } else if(AVG >= 80 && AVG < 90) {
            System.out.println("Average is Pass B: " + AVG);
        }
        else if(AVG >= 70 && AVG < 80) {
            System.out.println("Average is Pass C: " + AVG);
        }
        else if(AVG >= 60 && AVG < 70) {
            System.out.println("Average is Pass D: " + AVG);
        }
        else if(AVG >= 50 && AVG < 60) {
            System.out.println("Average is Pass E: " + AVG);
        }
        else {
            System.out.println("Average is Pass F: " + AVG);
        }
    }
}
