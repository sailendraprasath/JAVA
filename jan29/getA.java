import java.util.Scanner;

public class getA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a array size here: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println();
        for(int i=0; i<size; i++){
        System.out.println("Value "+(i+1)+": "+arr[i]);
        }


        if (size%2==1) {
            int midValue = size/2;
            System.out.println(arr[midValue]);
        }
        else{
            int midval1 = size/2-1;
            int midval2 = size/2;
            System.out.println(arr[midval1]);
            System.out.println(arr[midval2]);
        }
        scan.close();
    }
}
