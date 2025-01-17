import java.lang.System;
import java.util.Scanner;


public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value here: ");
        int val = scan.nextInt();

        if(val >= 35){
           System.out.print("Pass"); 
        }
        else{
            System.out.println("Fail");
        }
        scan.close();
        
    }
}