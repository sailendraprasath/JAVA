
class count{
    static int count = 0;
    int instanceNumber = 0;

    count(){
        count = count+1;
        instanceNumber = instanceNumber+1;;
    }
    void display(){
        System.out.println("instanceNumber: "+instanceNumber);
        System.out.println("Count: "+count);
    }
}
public class MyCount {
    public static void main(String[] args) {
        count obj1 = new count();
        obj1.display();
        count obj2 = new count();
        obj2.display();
        count obj3 = new count();
        obj3.display();
    }
}
