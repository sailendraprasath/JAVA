
class Animal {
    void eat(){
        System.out.println("This animal can eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("This animal can bark");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Cat can meow");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        Cat obj1 = new Cat();
        obj1.meow();
        obj1.eat();
    }
}
