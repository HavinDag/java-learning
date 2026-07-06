package day04;

public class IncrementDecrement {
    public static void main(String[] args) {

        //Increment
        int a = 5;
        System.out.println(a);

        a = a + 2; //7
        System.out.println(a);

        a += 2; //9
        System.out.println(a);

        //Decrement
        int c = 8;
        System.out.println(c);

        c = c - 3;
        System.out.println(c);

        c -= 3;
        System.out.println(c);

        //Increment2
        int d = 6;
        System.out.println(d);

        d = d * 2;
        System.out.println(d);

        d *= 2;
        System.out.println(d);

        //Decrement2
        int e = 24;
        System.out.println(e);

        e = e / 2;
        System.out.println(e);

        e /= 2;
        System.out.println(e);

        //increment with 1
        int f = 13;
        f = f + 1;
        f += 1;
        f++;

        //decrement with 1
        int h = 9;
        h = h - 1;
        h -= 1;
        h--;

        //post-increment / pre-increment
        int i = 10;
        int k = i++;
        System.out.println(k);
        System.out.println(i);

        int m = 15;
        int n = ++m;
        System.out.println(m);
        System.out.println(n);

        //Example
        int p = 17;
        int r = p--;

        System.out.println(p);
        System.out.println(r);



    }
}
