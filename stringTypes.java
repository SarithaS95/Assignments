package Practise;

public class stringTypes {
    //StringBuffer      -mutable, values stored in heap area, only one get created, Thread safety
    //String Builder    -mutable, values stored in heap area,only one get created, not thread safety
    //Strings       -immutable, values stored in STRING POOL, cannot be appended- 2 different references get created
    //StringBuffer & String Builder has many functions inbuilt eg.Reverse
    //Need to take input from user as string, convert to buffer or builderr and perform required functions
    //output again needs to be converted back to string to print.
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Saritha");
        stringBuffer.append("Surampudi");
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        StringBuilder stringBuilder=new StringBuilder("Saritha");
        stringBuilder.append("Surampudi");
        stringBuilder.reverse();
        System.out.println(stringBuilder);


        //strings are immutable
        String s="Saritha";
        String h="Saritha";
        System.out.println(s==h);           //true
        System.out.println(s.equals(h));    //true
        s="hello";
        System.out.println(s);

        //string with new operator will be stored in OA
        String k=new String("Harsha");
        String m=new String("Harsha");
        System.out.println(k==m);                   //false
        System.out.println(k.equals(m));            //true

        //strings are immutable
        String a="aritha";
        String b="Saritha";
        System.out.println(a==b);           //false
        System.out.println(a.equals(b));    //false
        s="hello";
        System.out.println(s);
    }

}
