
class Student{
    int mark = 0;
    static String Teacher = "Sailesh";
}
public class StaticIn {
    public static void main(String[] args) {
        Student obj1 = new Student();
        int result = obj1.mark = 50;
        Student.Teacher = "max";
        System.out.println(result);
        System.out.println(Student.Teacher);

        Student obj2 = new Student();
        System.out.println(Student.Teacher);
    }
}
