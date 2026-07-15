package day08;

public class ForLoops01 {
    public static void main(String[] args) {

        //First Way
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //Second Way
        //a) for loop

        for (int i=1 ; i<6 ; i++){
            System.out.println("Hi..");
        }

        for (int i=1 ; i<26 ; i++){
            System.out.println("Hi!");
        }

        for (int i=40 ; i>22 ; i--){

            if (i%2==0){
                System.out.println(i);
            }
        }

    }
}
