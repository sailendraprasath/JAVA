public class loopEO {
    public static void main(String[] args) {
        int a = 10;

        for(int i = 1; i <= a; i = i + 1){
            if (i % 2 == 0) {
                System.out.println(i+" Even");
            }
            else{
                System.out.println(i+" Odd");
            }
        }
    }
}
