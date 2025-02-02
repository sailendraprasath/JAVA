class Teacher {
   private String T_name = "Ram";    
   void display(){
    System.out.println(T_name);
   }
}
public class AccessIn {
    public static void main(String[] args) {
        Teacher obj1 = new Teacher();
        obj1.display();
    }
}
