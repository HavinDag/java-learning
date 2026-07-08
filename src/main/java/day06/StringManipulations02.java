package day06;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java earn 12345 money";

        //1
        String s1 = s.replace("money" , "dollar"); //Change the character of your choice.
        System.out.println(s1);

        //2
        String s2 = s.replace("e", ""); //Can delete any character you wish.
        System.out.println(s2);

        //3
        String s3 = s.replaceAll("[0-9]", "*"); //Converts all characters to the characters of your choice.
        System.out.println(s3);

        //4
        int num = s.replaceAll("[^0-9]", "" ).length(); //Shows how many of the values you have entered there are.
        System.out.println(num);
    }
}
