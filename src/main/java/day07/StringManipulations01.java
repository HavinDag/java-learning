package day07;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password.");
        String pwd = input.nextLine();

        boolean lengthControl = pwd.length()>7;
        System.out.println("lengthControl = " + lengthControl);

        boolean spaceControl = !pwd.contains(" ");
        System.out.println("spaceControl = " + spaceControl);

        boolean upperCaseControl = pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("upperCaseControl = " + upperCaseControl);

        boolean  lowerCaseControl = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("lowerCaseControl = " + lowerCaseControl);

        boolean numControl = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("numControl = " + numControl);

        boolean result = lengthControl && spaceControl && upperCaseControl && lowerCaseControl && numControl;
        if (result){
            System.out.println("Password is valid!");
        }
        else{
            System.out.println("Password is invalid");
        }


    }
}
