package day04;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int num = input.nextInt();

        //First Way
        if (num % 2 == 0) {
            System.out.println("Even number");
        }

        if (num % 2 != 0) {
            System.out.println("Odd number");
        }

        //Second Way
        if (num%2==0) {
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
}
