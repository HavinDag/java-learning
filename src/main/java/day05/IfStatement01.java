package day05;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();

        if (num>0){
            System.out.println("This is a positive number.");
        }

        else if (num<0){
            System.out.println("This is a negative number.");
        }

        else{
            System.out.println("This is a neutral number.");
        }

    }
}
