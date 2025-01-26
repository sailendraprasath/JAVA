public class prime{
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("print prime num 1 to 100:");
        for(int i=2; i<=100;i++){
            if (isprime(i)) {
                System.out.print(i+" ");
                sum++;
            }
        }
        System.out.println();
        System.out.println("sum of prime num from 1 to 100 is: "+sum);
    }
    public static boolean isprime(int number){
        if (number<=1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(number);i++){
            if (number%i==0) {
                return false;
            }
        }
        return true;
    }
}