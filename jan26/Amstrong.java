import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int num = scan.nextInt();

        if (isAmstrong(num)) {
            System.out.println(num+" is Amstrong");
        }
        else{
            System.out.println(num+" is not a Amstrong");
        }
        scan.close();
    }
    public static boolean isAmstrong(int num){
        int original = num;
        int sum = 0;

        int digitnum = String.valueOf(original).length();

        while (num>0) {
            int digit = num%10;
            sum += Math.pow(digit, digitnum);
            num /= 10;  
        }
        return sum == original;
    }
}