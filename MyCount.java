
class count{
    static int count = 0;
    int instanceNumber = 0;

    count(){
        count++;
        instanceNumber++;
    }
    void display(){
        System.out.println("instanceNumber: "+instanceNumber);
        System.out.println("Count: "+count);
    }
}
public class MyCount {
    public static void main(String[] args) {
        
    }
}
