package day06;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to see its absolute value");
        int num = input.nextInt();

        int result = num<0 ? -1*num : num;
        System.out.println(result );

        int a = 13;
        int b = 7;

        Object result2 = (a>0 && b>0) || (a<0 && b<0) ? a*b : "Please enter the numbers marked with the same symbol";
        System.out.println(result2); //91
    }
}
