import java.util.Scanner;

public class Exp{
    public static void main(String[] args) {
      //  int a = 10  => this is compile error ";"
      Scanner scan = new Scanner(System.in);
      try{
          int a = scan.nextInt(); //int value ku pathila namma string value kudutha atha exception handling || runtime Error
      }
      catch(Exception err){
        System.out.println("Exception handle");
      }
      System.out.println("Program ended");
      scan.close();
    }
}