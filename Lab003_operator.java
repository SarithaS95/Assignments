package E_041124;

public class Lab003_operator {
    public static void main(String[] args) {
        //Arithmetic, Logical, Terenary, Unary, Compound Assignment , Relational Operators
        //1.Arithmentic + - / * % ||
        //2.Logical- AND    | OR| NOT
        //          T T->T  T T->T  !(T)-F
        //          T F->F  T F->T  !!(F)-F
        //          F T->F  F T->T  !!!!(T)-T
        //          F F->F  F F->F

        //3.Terenay - If this condition is true, then perform this or vice versa
        //          - (a>b) ? a:b
        //4. Unary - +10 ->10
        //           -10 ->10

        //5. Relational - Boolean (true,false)
        //              - (>,<,=,>=,<=,)

        //Compound assignments -> b-=90 i.e b=89

        //Left to right & BODMAS
        int a=10;
        int b=20;
        String s="Saritha";
        String h="Harsha";
        System.out.println(a+b+s+h);  //30SarithaHarsha
        System.out.println(s+h+a+b);    //SarithaHarsha1020

        // booleans cannot be compared
        // $,_ can only be used for declaring data variables
        //Primitive data types - cannot be divided further -> Byte(-127 to 128), short(-31k to 32k),char,int,float,long,double
        //Non Primitive data types- Can be divided further -> String, Class, Interface
        //                                                 -> 8 byte

        //keywords              |vs Identifiers                     |       vs Variables
        //Unique                |Cannot be keyword                  |       container to store value
        //lower case            |can use keywords in uppercase      |       have class, instance,local level
        //Pre-defined           |name give n                        |
        //Reserved              |Public, Class
        //public,static,class   |






    }
}
