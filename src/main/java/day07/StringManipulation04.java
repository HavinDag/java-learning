package day07;

public class StringManipulation04 {
    public static void main(String[] args) {

        String pwd = "abc";

        boolean first = pwd.isEmpty();
        System.out.println(first);

        boolean second = pwd.isBlank();
        System.out.println(second);

        boolean third = pwd.trim().equals(pwd);
        System.out.println(third);

        if (first){
            System.out.println("The password cannot be left blank!");
        }

        if (second){
            System.out.println("The password must contain visible characters other than spaces!");
        }

        if (!third){
            System.out.println("Do not leave a space at the beginning or end of your password!");
        }



    }
}
