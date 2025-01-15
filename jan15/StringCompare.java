import java.lang.System;
// import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        String f1 = new String("apple");
        String f2 = new String("apple");

        String a1 = "Orange";
        String a2 = "Orange";

        System.out.println(f1 == f2);
        System.out.println(a1 == a2);

        System.out.println(f1.equals(f2));
    }
}
