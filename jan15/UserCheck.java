import java.lang.System;
import java.util.Scanner;
public class UserCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter num1 value here: ");
        int num1 = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter num2 value here: ");
        int num2 = scan.nextInt();
        scan.nextLine();

        if(num1 == num2){
            System.out.println("your given numbers are equal");
        }
        else{
            System.out.println("Your given numers are not equal");
        }
        scan.close();
    }
}
