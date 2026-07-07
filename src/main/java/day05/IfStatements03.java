package day05;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an age.");
        byte age = input.nextByte();

        if (age<0){
            System.out.println("Please enter a valid age.");
        }

        else if (age<5) {
            System.out.println("Baby");
        }

        else if (age<13) {
            System.out.println("Child");
        }

        else if (age<21) {
            System.out.println("Teenager");
        }

        else if (age<31) {
            System.out.println("Adult");
        }

        else {
            System.out.println("undefined age");
        }
    }
}
