package E_041124;
import java.lang.Math;

public class Assignment_Lab001 {
    public static void main(String[] args) {
        System.out.println("Question1: Increment");
        int a = 10;
        System.out.println(++a + a++ + a++);
        //increment and then result- ++a ,a -->11, 11
        // result and then increment a++, a  -->11, 12
        //                           a++,a   -->12, 13

        System.out.println("Question2: Decrement");
        int b=10;
        System.out.println(--b + b++ + ++b);
        //Decrement and then result  --b , b    -->9, 9
        // result and then increment b++ , b    -->9, 10
        //                           ++b , b    -->11, 11

        System.out.println("Question3: Max number");
        int x=100; int y= 15; int z=10;
        int max = (x>y) ?
                  (x>z ? x:z) : (y>z ?y:z);
                System.out.println(max);

        System.out.println("Question4: Cube root of (x2+y2-|z|) ");
        int  i = 10; double j= 12.4;  double k= 56.78;
        double total=Math.pow(i,2)+Math.pow(j,2)-Math.abs(k);
        System.out.println(Math.cbrt(total));





    }
}

