package day08;

public class ForLoops03 {
    public static void main(String[] args) {

        //Interview question – Adding the digits of an integer
        //578
        
        int sum = 0;
        for (int i = 578; i > 0 ; i=i/10) {

           sum = sum + i%10;
        }
        System.out.println(sum);



        //writing using unique characters
        String t = "mehmet";
        String unique = "";

        for (int i = 0; i <t.length() ; i++) {
            char ch = t.charAt(i);

            if (t.indexOf(ch)==t.lastIndexOf(ch)){
                unique = unique + ch;
            }
            
        }
        System.out.println(unique);

        //The sum of the integers from 5 to 8
        int total = 0;

        for (int i = 5; i < 9; i++) {
            total = total+i;
            
        }
        System.out.println(total);

        //The product of the integers from 7 to 9

        int multiply = 1;
        for (int i = 7; i < 10; i++) {
            multiply = multiply * i;
        }
        System.out.println(multiply);
    }
}
