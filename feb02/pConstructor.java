public class pConstructor {
    int mark;
    String name;

    pConstructor(int a){
        System.out.println(a);
        System.out.println("Heloo");
    }
    pConstructor(){
        System.out.println("Empty constructor");
    }
    public static void main(String[] args) {
        // pConstructor obj1 = new pConstructor(10);
        // pConstructor obj2 = new pConstructor();
        // System.out.println(obj1.mark);
        // System.out.println(obj1.name);
    }
}
