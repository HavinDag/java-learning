package day05;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day name.");
        String dayName = input.next();

        boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");
        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday") || dayName.equalsIgnoreCase("Friday");

        if (isWeekendDay){
            System.out.println("Weekend Day");
        }

        else if (isWeekDay) {
            System.out.println("Week day");
        }

        else {
            System.out.println("Invalid day name..");
        }

    }
}
