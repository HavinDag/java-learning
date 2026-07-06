package day04;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name and surname.");
        String fullName = input.nextLine();

        System.out.println("Please enter your age.");
        byte age = input.nextByte();

        System.out.println("Please enter your height.");
        float height = input.nextFloat();

        System.out.println("Please enter your weight.");
        short weight = input.nextShort();

        System.out.println("Please enter your marital status.");
        String maritalStatus = input.next();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);
    }
}
