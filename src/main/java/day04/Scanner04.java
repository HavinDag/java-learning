package day04;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a five-digit number.");
        int num = input.nextInt();

        int firstTwo = num/1000;
        int lastTwo = num%100;

        System.out.println("The sums of the first two and last two steps = " + (firstTwo + lastTwo));
    }
}
