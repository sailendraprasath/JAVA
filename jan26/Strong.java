import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int num = scan.nextInt();

        if (isStrong(num)) {
            System.out.println(num+" is a Strong number");
        }
        else{
            System.out.println(num+" is not a strong number");
        }
        scan.close();
    }

    public static boolean isStrong(int num){
        int originalNum = num;
        int sum = 0;
        while (num>0) {
            int digit = num%10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == originalNum;
    }

    public static int factorial(int n){
        int result = 1;
        for(int i=1; i<=n;i++){
            result *=i ;
        }
        return result;
    }
}