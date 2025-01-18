import java.lang.System;
import java.util.Scanner;

class Gift{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your mark here: ");
        int mark = scan.nextInt();

        if(mark >= 35 && mark < 60){
            System.out.println("Vedio games");
        }
        else if(mark >= 60 && mark < 89){
            System.out.println("Iphone");
        }
        else if(mark >= 90 && mark <= 100){
            System.out.println("MacBook");
        }
        else{
            System.out.println("invalid plz check");
        }
        scan.close();
    }
}