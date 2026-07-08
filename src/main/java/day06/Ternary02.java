package day06;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();
        num = Math.abs(num);

        String result = 99<num && num<1000 ? "This number has three digits" : "This number does not have three digits";
        System.out.println(result);

        int year = 1600;
        String result2 = year%100==0 ? (year%400==0 ? "Leap" : "Not Leap") : (year%4==0 ? "Leap" : "Not Leap");
        System.out.println(result2);
    }
}
