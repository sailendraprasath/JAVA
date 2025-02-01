public class operation {
    void sum(int a, int b){
        int add = a+b;
        System.out.println(add);
    }
    void sub(int a, int b){
        int subr = a-b;
        System.out.println(subr);
    }
    void mul(int a, int b){
        int multi = a*b;
        System.out.println(multi);
    }
    void divi(int a,int b){
        int div = a/b;
        System.out.println(div);
    }
    public static void main(String[] args) {
        operation OPR = new operation();
        OPR.sum(5,10);
        OPR.sub(5,10);
        OPR.mul(5,10);
        OPR.divi(5,10);
    }
}
