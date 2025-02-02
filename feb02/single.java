class Animal{
    void eat(){
        System.out.println("This animal can eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog can bark");
    }
}
public class single {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        obj1.bark();
        obj1.eat();
    }
}
