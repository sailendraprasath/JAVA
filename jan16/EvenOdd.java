// find its even or odd 
import java.lang.System;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter a value here: ");
        int value = Scan.nextInt();

        if(value % 2 == 0){
            System.out.println("your given num "+value+" is Even");
        }
        else{
            System.out.print("your given num "+value+" is Odd");
        }
        Scan.close();
    }
}
