//Get input for Variable Mark . if mark > 35 print pass. else print fail

import java.lang.String;
import java.util.Scanner;
public class Mark {
    public static void main(String[] args) {
        Scanner Result = new Scanner(System.in);
        System.out.print("Enter your mark here: ");
        int Mark = Result.nextInt();
        if(Mark > 35){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
        Result.close();
    }
}
