class vehical{
    String brand;
    int year;
    void StartEngine(){
        System.out.println("It make sound");
    }
}
class Car extends vehical{
    String FuelType;
    void StartEngine(){
        System.out.println("Car engine starts");
    }
    void drive(){
        System.out.println("Car is driving");
    }
}
class Truck extends vehical{
    int LoadCapacity;
    void StartEngine(){
        System.out.println("Truck engine starts");
    }
    void haul(){
        System.out.println("Truck is houling");
    }
}
public class veh {
    public static void main(String[] args) {
        Car obj1 = new Car();
        String Car_name = obj1.brand = "BMW";
        int Car_year = obj1.year = 2024;
        String Car_fuel = "Desel";
        System.out.println(Car_name);
        System.out.println(Car_year);
        System.out.println(Car_fuel);
        obj1.StartEngine();
        obj1.drive();

        System.out.println();

        Truck obj2 = new Truck();
        String Truck_name = obj2.brand = "TATA";
        int Tuck_year = obj2.year = 2022;
        int Turck_capcity = obj2.LoadCapacity = 500;
        System.out.println(Truck_name);
        System.out.println(Tuck_year);
        System.out.println(Turck_capcity+"Ton");
        obj2.StartEngine();
        obj2.haul();
    }
}