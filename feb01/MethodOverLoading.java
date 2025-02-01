public class MethodOverLoading {

    void display(int a){
        System.out.println("one");
    }
    void display(int a,int b){
        System.out.println("two");
    }
    public static void main(String[] args) {
        MethodOverLoading obj1 = new MethodOverLoading();
        obj1.display(57, 67);
    }
}
