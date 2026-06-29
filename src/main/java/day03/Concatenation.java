package day03;

public class Concatenation {
    public static void main(String[] args) {

        String a = "A";
        Integer x = 3;
        Integer y = 5;

        System.out.println(a+x+y); //A35
        System.out.println(a+x*y); //A15
        System.out.println(a+(x+y)); //A8
        System.out.println(x+y+a); //8A
        System.out.println(x+a+y); //3A5
    }
}
