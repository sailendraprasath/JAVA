import java.util.Scanner;

public class EO {

    int EOresult(int num){
        if (num % 2 == 0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        return num;
    }
    public static void main(String[] args) {
        EO EvenOrOdd = new EO();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a value here: ");
        int result = scan.nextInt();

        EvenOrOdd.EOresult(result);
        scan.close();

    }
}
