public class sum1 {
    int getsum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        sum1 ADD = new sum1();
        int result = ADD.getsum(10, 5);
        System.out.println(result);
    }
}