import java.lang.System;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is score now: ");
        int score = scan.nextInt();

        if(score <= 50){
            System.out.println("You need to imporve");
        }
        else if(score >= 50 && score <= 70){
            System.out.println("Good job");
        }
        else{
            System.out.println("Excellent performance");
        }
        scan.close();
    }
}
