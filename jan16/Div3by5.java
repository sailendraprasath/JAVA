// get input for a number check whether it is divisible by both 3 and 5 or not.
// if yes then print the number is divisible by 3 and 5
// print the number is not divisible by 3and 5
import java.lang.System;
import java.util.Scanner;

public class Div3by5 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter a value 1: ");
        int val1 = Scan.nextInt();

        System.out.print("Enter a value2: ");
        int val2 = Scan.nextInt();

        if(val1 % 3 == 0 && val2 % 5 == 0){
            System.out.println("Your given numbers "+val1+" and "+val2+" are divisble by 3 and 5");
        }
        else{
            System.out.println("Your given numbers "+val1+" and "+val2+" are not divisble by 3 and 5");
        }
        Scan.close();
    }    
}
