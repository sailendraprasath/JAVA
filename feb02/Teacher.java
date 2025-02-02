public class Teacher {
    String getName;
    
    Teacher(){
        System.out.println("helloo");
    }
    void setName(String getName){
        this.getName = getName;
    }
    public static void main(String[] args) {
        Teacher obj1 = new Teacher();
        obj1.setName("max");
        System.out.println(obj1.getName);
    }
}