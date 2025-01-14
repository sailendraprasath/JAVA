import java.lang.System;
import java.util.Scanner;

public class Student {
    public static void main(String args[]){
        Scanner ReportCard = new Scanner(System.in);
        
        System.out.print("Enter yor name here: ");
        String UserName = ReportCard.nextLine();

        System.out.print("Enter your mark here: ");
        int UserMark = ReportCard.nextInt();
        ReportCard.nextLine();

        System.out.print("Enter your Department here: ");
        String UserDepartment = ReportCard.nextLine();

        int UserResult = UserMark / 10;

        System.out.println("Dear "+UserName+" your department is "+UserDepartment+" your score is "+UserMark+" Final Result is "+UserResult);
        ReportCard.close();
    }
}
