import java.lang.System;

public class OwnString2 {
    public static void main(String[] args) {
        String a = "one";
        String b = new String("one");
        String c = b;

        System.out.println(a == c);

        System.out.println(a.equals(c));
    }
}
