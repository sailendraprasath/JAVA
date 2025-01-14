// i will get three inputs from user then i'll add three values as well ass mul three values
//finaly divide added value and multiplled value else i got final result

import java.lang.System;
import java.util.Scanner;

class abc{
    public static void main(String args[]){
        Scanner GetValue = new Scanner(System.in);
        
        System.out.print("Enter a value: ");
        int a = GetValue.nextInt();

        System.out.print("Entre b value: ");
        int b = GetValue.nextInt();

        System.out.print("Enter c value: ");
        int c = GetValue.nextInt();

        System.out.println("Values are enterd a = "+a+" b = "+b+" c = "+c);

        int d = a * b * c;
        System.out.println("the multiple of total value is = "+d);
        int e = a + b + c;
        System.out.println("The Add of total value is = "+e);
        float result =d / e;
        System.out.println("Answer of D and E divided final answer is = "+result);

        GetValue.close();

    }
}