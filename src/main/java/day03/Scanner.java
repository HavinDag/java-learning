package day03;

public class Scanner {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Please enter your age");

        byte age = input.nextByte();
        System.out.println(age);
    }
}
