public class Demo {
    public static int fibonic(int n){
        if (n<=1) {
            return n;
        }else{
            return fibonic(-1) + fibonic(-2);
        }
    }
    public static void main(String[] args) {
        int val = 5;
        for(int i=0; i<val; i++){
            System.out.print(fibonic(i));
        }
    }
}