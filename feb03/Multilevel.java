
interface Animal{
    int mark = 63;
    void sound();

    // before java 8 apo method ku body vreate panna mudeyathu
    // void display0(){
        
    // }
    // after java 8 aprm default or static use panne body create pannalam
    // default void display1(){

    // }
    // static void display2(){

    // }
}
class Cat implements Animal{
   public void sound(){
    System.out.println("Meow");
   }
}




public class Multilevel {
   
    public static void main(String[] args) {
        Cat obj1 = new Cat();
        obj1.sound();
        System.out.println(obj1.mark);

    }
}
