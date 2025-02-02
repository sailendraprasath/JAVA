public class Constructor {
    int mark;
    String name;

    Constructor(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Constructor obj1 = new Constructor();

        System.out.println(obj1.mark);
        System.out.println(obj1.name);
    }
}