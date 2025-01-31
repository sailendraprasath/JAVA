public class Laptop {
    String name = "";
    String proc = "";
    int ram = 0;
    int price = 0;

    public static void main(String[] args) {
        Laptop lap1 = new Laptop();
        lap1.name = "Victus";
        lap1.proc = "i5";
        lap1.ram = 8;
        lap1.price = 63000;
        System.out.println(lap1.name);

        Laptop lap2 = new Laptop();
        lap2.name = "Asus";
        lap2.proc = "i7";
        lap2.ram = 6;
        lap2.price = 50000;
        System.out.println(lap2.name);

        
    }
}
