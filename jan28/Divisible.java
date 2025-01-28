public class Divisible {
    public static void main(String[] args) {
        int count = 0;

        for(int i=1; i<=100; i++){
            if (i%3==0 && i%5==0) {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("numbers from 1 to 100 are divisible by both 3 and 5 total count is: "+count);
    }
}
