abstract class vehical{
    final void StartEngine(){
        System.out.println("Engine started");
    }
    static String getVehicalType(){
        return  "Generic vehical";
    }
    abstract void drive();
}
class car extends vehical{
    void drive() { 
        System.out.println("Drive a Car");       
    }
}
class bike extends vehical{
    void drive() {   
        System.out.println("Drive a bike");     
    }
}

public class Combined {
   public static void main(String[] args) {
    car c1 = new car();
    c1.StartEngine();
    c1.drive();
    System.out.println(vehical.getVehicalType());

    bike b1 = new bike();
    b1.StartEngine();
    b1.drive();
    System.out.println(vehical.getVehicalType());
   }
}
