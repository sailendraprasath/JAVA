    abstract class Animal {
        String name;
        Animal(String name){
            this.name = name;
        }      
        abstract void makesound();
    }
    class dog extends Animal{
        dog(String name){
            super(name);
        }
        void makesound(){
            System.out.println("Boww boww");
        }
    }
    class cat extends Animal{
        cat(String name){
            super(name);
        }
        void makesound() {
            System.out.println("Meoww Meoww");
        }
    }
    public class Abs {
    public static void main(String[] args) {
        dog obj1 = new dog("bobby");
        System.out.println(obj1.name);
        obj1.makesound();

        cat obj2 = new cat("Tommy");
        System.out.println(obj2.name);
        obj2.makesound();
    }
}