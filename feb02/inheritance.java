
class Dad{
    int money = 2000;
}
class Son extends Dad{
}
public class inheritance {
    public static void main(String[] args) {
        Son obj1 = new Son();
        System.out.println(obj1.money);
    }
}
