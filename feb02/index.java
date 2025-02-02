class Animals{
    String name;
    int age;
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animals{
    String breed;
    void makeSound(){
        System.out.println("Dogs barks");
    }
    void fetch(){
        System.out.println("Dog is fetching");
    }
}
class Cat extends Animals{
    String color;
    void makeSound(){
        System.out.println("Cats meow");
    }
    void climb(){
        System.out.println("Cat is climbing");
    }
}
public class index {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        obj1.name = "Husky";
        obj1.age = 2;
        obj1.breed = "Husky breed";
        obj1.makeSound();
        obj1.fetch();
        System.out.println();
        Cat obj2 = new Cat();
        obj2.name = "joes";
        obj2.age = 2;
        obj2.color = "brown with white";
        obj2.makeSound();
        obj2.climb();
    }
}
