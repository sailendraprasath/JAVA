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
class Puppy extends Dog{
    void weep(){
        System.out.println("This animal can sound weep");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Puppy obj1 = new Puppy();
        obj1.eat();
        obj1.bark();
        obj1.weep();
    }
}
