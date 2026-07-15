package day08;

public class ForLoops02 {
    public static void main(String[] args) {

        //writing up to a
        String s = "I love Java";

        for (int i = 0; i <s.length() ; i++) {

            char ch = s.charAt(i);
            if (ch=='a') {
                break;
            }
            System.out.print(ch);
        }
        System.out.println();


        //removing lowercase letters
        String s1 = "Pwd12?Ab";

        for (int i = 0; i <s1.length() ; i++) {

            char ch = s1.charAt(i);
            if (ch>='a' && ch<='z'){
                continue;
            }else {
                System.out.print(ch);
            }
        }
        System.out.println();


        //backwards writing
        String b = "Java";
        String backwards = "";

        for (int i = b.length()-1; i>=0; i--) {

            backwards = backwards+b.charAt(i);
        }
        System.out.print(backwards);
    }
}
