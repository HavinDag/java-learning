package day04;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers.");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println("Addition = "+ (firstNumber + secondNumber));
        System.out.println("Subtraction = "+ (firstNumber - secondNumber));
        System.out.println("Multiplication = "+ (firstNumber * secondNumber));
        System.out.println("Division = "+ (firstNumber / secondNumber));


    }
}
