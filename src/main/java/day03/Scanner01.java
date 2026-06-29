package day03;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");

        byte age = input.nextByte();
        System.out.println(age);
    }
}
