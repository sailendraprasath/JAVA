public class CountEven{
    public static void main(String[] args) {

        int evenCount = 0;
        for(int i=1; i<=10; i++){
            if (i%2==0) {
                System.out.print(i+" ");
                evenCount++;
            }
        }
        System.out.println();
        System.out.println("number of even from 1 to 10 is: "+evenCount);
    }
}