import java.util.Scanner;

public class CyclicPattern {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a input value here: ");
        int n = scan.nextInt();

        for(int i=1; i<=n; i=i+1){
            for(int j=i; j<=n; j=j+1){
                System.out.print(j+" ");
            }
            for(int j=1; j<i; j=j+1){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
