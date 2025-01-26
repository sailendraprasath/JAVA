import java.util.Scanner;

public class nums4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("enter coffeciant of a");
        double a = scan.nextDouble();
        System.out.print("enter coffeciant of b");
        double b = scan.nextDouble();
        System.out.print("enter coffeciant of c");
        double c = scan.nextDouble();

        if (a == 0) {
            System.out.println("there is not quadratic equation");
        }
        else{
            double dis = b * b -4 * a *c;

            if (dis>0) {
                double root1 = (-b+Math.sqrt(dis))/(2*a);
                double root2 = (-b-Math.sqrt(dis))/(2*a);
                System.out.println("this has two real and distinct solution");
                System.out.println(root1);
                System.out.println(root2);
            }
            else if(dis == 0){
                double root = -b/(2*a);
                System.out.println("this has one real and repeated solution");
                System.out.println(root);
            }
            else{
                System.out.println("this has no real solution");
            }

        }

        scan.close();
    }
}