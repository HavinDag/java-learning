package day05;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your gender.");
        String gender = input.next();

        System.out.println("Please enter your age.");
        int age = input.nextInt();

        if (age<0 || age>120){
            System.out.println("Please enter an age between 0 and 120!");
        }

        else if (gender.equalsIgnoreCase("Woman")){
            if (age>60){
                System.out.println("Eligible to retire.");
            }else{
                System.out.println("Not eligible to retire.");
            }
        }

        else if (gender.equalsIgnoreCase("Man")) {
            if (age>65){
                System.out.println("Eligible to retire.");
            }else{
                System.out.println("Not eligible to retire.");
            }
        }

        else{
            System.out.println("Not defined!");
        }

    }
}
