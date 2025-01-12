//user ta irunthu name , age as well as address uh vaanguren
package jan12;
import java.lang.System;
import java.util.Scanner;

public class AddAgeName {
        public static void main(String args[]){
        Scanner Result = new Scanner(System.in);
        // username vaanguren 
        System.out.print("What is your Name: ");
        String UserName = Result.nextLine();   
        //UserAge vaanguren
        System.out.print("What is your age: ");
        int UserAge = Result.nextInt();
        Result.nextLine();
        //UserAddress
        System.out.print("Enter your Address here: ");
        String UserAddress = Result.nextLine();
        // ing print panna pore
        System.out.println("Your name is "+UserName+" Your age is "+UserAge +" your address is "+UserAddress);
        Result.close();
    }
}
