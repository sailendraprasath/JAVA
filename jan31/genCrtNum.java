import java.util.Scanner;

public class genCrtNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int count = 0;
        do {
            System.out.print("Enter a num > 10: ");
            count = scan.nextInt();
            if (count<=10) {
                System.out.println("please enter valid num");
            }
        } while (count <= 10);
        scan.close();
    }
}
