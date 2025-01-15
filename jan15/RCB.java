//if RCB win Ee Saala cup naamadhey else cup ila bye
import java.lang.System;
import java.util.Scanner;

public class RCB {
    public static void main(String[] args) {
        Scanner IPL = new Scanner(System.in);
        System.out.print("Enter RCB win or loose: ");
        String finalResult = IPL.nextLine().toLowerCase();

        if(finalResult.equals("win")){
            System.out.println("Ee Saala Cup Naamadhey..!!");
        }
        else{
            System.out.println("Cup ila bye..!!");
        }
        IPL.close();
    }    
}
