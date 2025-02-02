
class Animals{
    int age = 12;
    Animals(String name){
        System.out.println(name);
    }
    void makeSound(){
        System.out.println("Animal make sounds");
    }
}
class Dog extends Animals{
    Dog(){
        super("monkey");
        super.makeSound();
        System.out.println("Dogs");
        System.out.println(super.age);
    }
}
public class Zoo {
    public static void main(String[] args) {
        // Dog obj1  = new Dog();
    }
}
