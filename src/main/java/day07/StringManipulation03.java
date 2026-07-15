package day07;

public class StringManipulation03 {
    public static void main(String[] args) {

        String s = "mehmet";

        if (s.indexOf("m")==s.lastIndexOf("m")){
            System.out.println("m");
        }

        if (s.indexOf("e")==s.lastIndexOf("e")){
            System.out.println("e");
        }

        if (s.indexOf("h")==s.lastIndexOf("h")){
            System.out.println("h");
        }

        if (s.indexOf("t")==s.lastIndexOf("t")){
            System.out.println("t");
        }
        System.out.println();


        String cardNum = "1234 6789 1234 6789";
        String first = cardNum.substring(0,15).replaceAll("[0-9]","*");
        String last = cardNum.substring(15);
        System.out.println(first+last);

        String result1 = first+last;
        System.out.println("result1 = " + result1);

        String result2 = first.concat(last);
        System.out.println("result2 = " + result2);


    }
}
