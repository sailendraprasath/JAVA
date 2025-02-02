//super class
class Animal {
    void eat(){
        System.out.println("This animal can eat");
    }
}
//sub class
class Cat extends Animal{
    void meow(){
        System.out.println("Cat can meow");
    }
}
//sub class
class Dog extends Animal{
    void bark(){
        System.out.println("This animal can bark");
    }
}
// derived class 
class Puppy extends Dog{
    void weep(){
        System.out.println("puppy can do weep");
    }
}
public class Hybrid {
    public static void main(String[] args) {
        Cat obj1 = new Cat();
        obj1.meow();
        obj1.eat();
    }
}
