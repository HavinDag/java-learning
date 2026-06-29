package day03;

public class Operators {
    public static void main(String[] args) {

        int peopleNumber = 10;
        int moneyAmount = 25;
        System.out.println(moneyAmount/peopleNumber); //2

        int studentsNumber = 10;
        double feeAmount = 25;
        System.out.println(feeAmount/studentsNumber); //2.5

        boolean first = 3<5;
        boolean second = 2+3!=5;
        boolean third = 2+3*5>=19;
        System.out.println(first&&second); //false
        System.out.println(first||second||third); //true

    }
}
