import java.util.Scanner;

public class Adam {
    public static int reversed(int num){
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a num value: ");
        int num = scan.nextInt();

        int square = num * num;
        int reverseNum = reversed(num);


        int sqReverse = reverseNum * reverseNum;
        int reverseSq = reversed(square);

        if (sqReverse == reverseSq) {
            System.out.println(num+" is an adam");
        }
        else{
            System.out.println(num+" is not adam");
        }
        scan.close();
    }
}