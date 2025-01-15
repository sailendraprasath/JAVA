//if Meghana is dead Surya meets ramya else Surya weds Meghana

import java.lang.System;
import java.util.Scanner;

public class Surya {
    public static void main(String[] args) {
        Scanner Result = new Scanner(System.in);
        System.out.print("Meghana is Dead Enter Yes or no: ");
        String Meghana = Result.nextLine().toLowerCase();
        if(Meghana.equals("yes")){
            System.out.println("Surya Meets Ramya..!!");
        }
        else{
            System.out.println("Surya WEDS Meghana");
        }
        Result.close();
    }
}
