// get input for variable "income". if income is greater than 7000 
// scholarship is available else not eligible
// for scholarship
import java.lang.System;
import java.util.Scanner;

public class income {
    public static void main(String args[]){
        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter your income here: ");
        int income = Scan.nextInt();

        if(income > 7000){
            System.out.println("Scholarship is available");
        }
        else{
            System.out.println("Oops!! not eligible");
        }
        Scan.close();
    }
}
