import java.util.Scanner;

public class Ascore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 5;
        int sum = 0;
        
        int[] score = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter a value: ");
            score[i] = scan.nextInt();
        }
        System.out.println("Score Entered sucsessfully..!!");
        System.out.println();

        System.out.println("this is your entered score ");
        for(int i=0; i<n; i++){
            System.out.println("score "+(i+1)+": "+score[i]);
        }

        int i = 0;
        while (i < n) {
            sum += score[i];
            i++;
        }
        System.out.println();

        System.out.println(sum);
        scan.close();
    }
}