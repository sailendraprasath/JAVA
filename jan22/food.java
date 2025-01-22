import java.lang.System;

public class food {
    public static void main(String[] args) {
       boolean kfc = true;
       boolean chicken = false;
       boolean pepsi = true;
       
       
       if(kfc){
        System.out.println("I eat");
        if (chicken) {
            System.out.println("i taste chicken");
            if (pepsi) {
                System.out.println("i drink");
            }
        }
       }
    }
}