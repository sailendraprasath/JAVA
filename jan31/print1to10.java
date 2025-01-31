public class print1to10 {
    public static void main(String[] args) {
         System.out.println("print num from 1 to 10 using for loop");
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("print num from 1 to 10 using while loop");
        int num = 1;
        while (num <= 10) {
            System.out.print(num+" ");
            num++;
        }
    }
}
