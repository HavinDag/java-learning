package day04;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the lengths of two sides of a rectangle.");
        float shortSide = input.nextFloat();
        float longSide = input.nextFloat();

        System.out.println("Area of the Rectangle = " + (shortSide * longSide));
        System.out.println("perimeter of the rectangle = " + (2*shortSide + 2*longSide));
    }
}
