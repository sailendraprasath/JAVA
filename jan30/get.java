import java.util.Scanner;

public class get {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=5;
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            System.out.print("Enter a value: ");
            arr[i] = scan.nextInt();
        }
        System.out.println();

        for(int j=0; j<n; j++){
            System.out.println("value "+(j+1)+": "+arr[j]);
        }



        scan.close();
    }
}
