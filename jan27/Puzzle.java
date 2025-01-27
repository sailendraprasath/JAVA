public class Puzzle {
    public static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for(int i=2; i<=Math.sqrt(num);i++){
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void generate(int num){
        int count = 0;
        int n = 2;

        while (count <= num) {
            if (isPrime(n)) {
               System.out.print(n+" ");
               count++; 
            }
            n++;
        }
    }
    public static void main(String[] args) {
        int gen = 10;
        System.out.println("first "+gen+" number of prime number is ");
        generate(gen);
    }
}