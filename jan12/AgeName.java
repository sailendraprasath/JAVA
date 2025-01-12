//user ta irunthu name and age vaanguren
package jan12;
import java.lang.System;
import java.util.Scanner;

public class AgeName {
       public static void main(String args[]){
        Scanner Result = new Scanner(System.in);
        // username vaanguren 
        System.out.print("What is your Name: ");
        String UserName = Result.nextLine();   
        //UserAge vaanguren
        System.out.print("What is your age: ");
        int UserAge = Result.nextInt();
        // ing print panna pore
        System.out.println("Your name is "+UserName+" Your age is "+UserAge );
        Result.close();
    }
}
