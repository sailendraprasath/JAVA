import java.util.Scanner;
import java.util.Random;

public class lottery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your lottery number here: ");
        int count = scan.nextInt();

        int eventCount = 0;
        int oddCount = 0;

        for(int i=1; i<=count; i++){
            int num = random.nextInt(100)+1;
            System.out.print(num+" ");

            if (num%2==0) {
                eventCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println();

        System.out.println("number of even count is: "+eventCount);
        System.out.println("number of odd count is: "+oddCount);


        scan.close();
    }
}