package Practise;

import java.util.Scanner;

public class Lab005_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Score!!");
        int score = sc.nextInt();
        int result=score/100;
        switch(result){
            case 9:
                System.out.println("Grade is A");
                break;
            case 8:
                System.out.println("Grade is B");
                break;
            case 7:
                System.out.println("Grade is C");
                break;
            case 6:
                System.out.println("Grade is D");
                break;

            default:
                System.out.println("Failed");


        }

    }
}
