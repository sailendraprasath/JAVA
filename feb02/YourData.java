
class Person{
    public String name;
    protected int age;
    private int SocialSecurityNumber;
    String Address;

    void display(){

    }

    Person(String name, int age, int ssn, String address ){
        this.name = name;
        this.age = age;
        this.Address = address;
        this.SocialSecurityNumber = ssn;
    }
}
class employee extends Person{
    employee(String name, int age, int ssn, String address){
        super(name,age,ssn,address);
        System.out.println("Hello CEO");
    }
}
public class YourData {
    public static void main(String[] args) {
        employee obj1 = new employee("sailesh",20,50,"madurai");
        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.Address);
        // System.out.println(obj1.SocialSecurityNumber);


    }
}
