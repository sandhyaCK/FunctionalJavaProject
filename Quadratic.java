/*#******************************************************************************************************************
        # @purpose :Demonstrate Quadratic Logic.
        # @file  :Quadratic.java
        # @author :Sandhya
   #*****************************************************************************************************************/
package com.BridgeLabz.FunctionalProgram;
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double root1,root2;
        double delta = 0;
        double quadratic = 0;
        System.out.println("a");
        int a = sc.nextInt();
        System.out.println("b");
        int b= sc.nextInt();
        System.out.println("c");
        int c = sc.nextInt();
        delta = (Math.pow(b ,2) - (4*a*c));
        System.out.println("delta" +delta);
        if(delta>0) {
            double d = delta / (2*a);
            quadratic = Math.sqrt(d);
            root1 = ((-b) + quadratic);
            root2 = ((-b) - quadratic);

            System.out.println("root1" +root1);
            System.out.println("root2" +root2);
        }

        else if(delta == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.println("root1" +root1 );
        }
        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-delta) / (2 * a);
            System.out.println( "real and imaginary parts are" +realPart  +" "  +imaginaryPart);



        }
    }
}
