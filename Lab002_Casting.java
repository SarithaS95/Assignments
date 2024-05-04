package Practise;

public class Lab002_Casting {
    public static void main(String[] args) {

        byte i = 20;
        double k = i; //implicit casting -jvm will take care of

        double s= 38675535476674567d;
        float t= (float)s;      //Explicit casting
        System.out.println(s);

        //Two types in each
        //Widening-small to big -> byte-int
        //Narrowing- big to small ->int-byte
    }

}
