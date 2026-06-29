package day03;

public class TypeCasting {
    public static void main(String[] args) {

        //Auto Widening
        byte age = 13;
        int ageInt = age;
        System.out.println(ageInt);

        //Explicit Narrowing
        int weight = 300;
        short weightShort = (short) weight;
        System.out.println(weightShort);

        double a = 00.99F;
        float ba = (float) a;
        System.out.println(ba);

        long x = 99999999L;
        int yx= (int) x;
        System.out.println(yx);



    }
}
