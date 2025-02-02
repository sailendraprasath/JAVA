public class cons {
    int mark;
    String name;

    cons(int a, String b){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        cons obj1 = new cons(80,"Sailesh");
        String Std_name  = obj1.name = "Sailesh";
        int marks = obj1.mark = 50;

        System.out.println("Your name is "+Std_name+" and your mark is "+marks);

    }
}
