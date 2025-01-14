import java.lang.System;
import java.util.Scanner;

class rain {
    public static void main(String[] args) {
        Scanner Results = new Scanner(System.in);

        System.out.print("is rain enter yes or no: ");
        String rain = Results.nextLine().toLowerCase();


        if(rain.equals("yes")){
            System.out.print("Take an umberlla");
        }
        else{
            System.out.print("Enjoy the sunlight");
        }
        Results.close();
    }
}
