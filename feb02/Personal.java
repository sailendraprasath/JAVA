
class Person{
    String name;
    Person(String name){
        System.out.println(this.name = name);
    }
}
class Employee extends Person{
    int EmployeeID;
    Employee(){
        super("Employe detail");
        super.name = "Sailesh";
    }
    void Emdetails(){
        System.out.println(name);
    }
}

public class Personal {
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        int ID = obj1.EmployeeID = 33;
        obj1.Emdetails();
        System.out.println(ID);

    }
}
