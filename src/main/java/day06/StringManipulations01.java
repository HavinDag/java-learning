package day06;

public class StringManipulations01 {
    public static void main(String[] args) {

        String s = "Java is easy";

        //1
        int sLength = s.length(); //Gives the number of characters used.
        System.out.println(sLength);

        //2
        char firstChar = s.charAt(0); //Gives the character of the number you have entered.
        System.out.println(firstChar); //J

        char lastChar = s.charAt(11);
        System.out.println(lastChar); //y

        char lastChar2 = s.charAt(s.length()-1);
        System.out.println(lastChar2); //y

        //3
        String s1 = s.substring(0,4); //Displays the characters within the range you have specified.
        System.out.println(s1);//Java

        String s2 = s.substring(5,7);
        System.out.println(s2);//is

        String s3 = s.substring(8,12);
        System.out.println(s3);//easy

        //Second Way
        String s4 = s.substring(8); //Start with a character and carry on right to the end.
        System.out.println(s4);

        //4
        boolean isExist = s.contains("Easy"); //Checks whether the value you have provided exists.
        System.out.println(isExist); //false

        //5
        boolean isStart = s.startsWith("Java"); //Checks whether it starts with the character you entered.
        System.out.println(isStart);//true

        //6
        boolean isEnd = s.endsWith("easy"); //Checks whether it ends with the character you entered.
        System.out.println(isEnd); //true


    }
}
