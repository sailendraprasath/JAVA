import java.lang.System;
import java.util.Scanner;

public class getnum {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int a = Scan.nextInt();

        System.out.print("Enter b value: ");
        int b = Scan.nextInt();

        for(int i = a; i <= b; i=i+1){
            System.out.println(i);
        }
        Scan.close();
    }
}