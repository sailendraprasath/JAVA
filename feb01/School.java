import java.util.Scanner;

public class School {
    String PassOrFail(String result, int mark){
        if (mark >= 35) {
            System.out.println("pass");
        }
        else{
            System.out.println("Fail");
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your mark here: ");
        int mark = scan.nextInt();

        School check = new School();
        String finalResult = check.PassOrFail("",mark );

        System.out.println(finalResult);
        scan.close();
    }
}
