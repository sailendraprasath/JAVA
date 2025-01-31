import java.util.Random;

public class genRandom {
    public static void main(String[] args) {
        Random rand = new Random();

        int val = 1;
        while (val <= 5) {
            int get = rand.nextInt(100)+1;
            System.out.print(get+" ");
            val++;
        }
    }
}
