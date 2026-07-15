package day07;

public class StringManipulations02 {
    public static void main(String[] args) {

        String tv = "$456.99";
        String laptop = "$875.99";

        String newTv = tv.replace("$","");
        String newLaptop = laptop.replace("$","");

        Double totalPrice = Double.valueOf(newTv) + Double.valueOf(newLaptop);
        System.out.println(totalPrice);



        String name = " ali cAN ";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last);

        System.out.println(""+first+last);



        String a = "abc@gmail.com";

        System.out.println(a.substring(4,9));
        int startingIndex = a.indexOf("@")+1;
        int endingIndex = a.indexOf(".");
        String companyName = a.substring(startingIndex,endingIndex);
        System.out.println("companyName = " + companyName);

    }
}
