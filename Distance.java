/*#******************************************************************************************************************
        # @purpose :Demonstrate Distance Logic.
        # @file  :Distance.java
        # @author :Sandhya
   #*****************************************************************************************************************/
package com.BridgeLabz.FunctionalProgram;
import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        double distance = 0;
        double count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the x1:");
        int x1 = sc.nextInt();
        System.out.println("enter the x2:");
        int  x2 = sc.nextInt();
        System.out.println("enter the y1:");
        int y1 = sc.nextInt();
        System.out.println("enter the y2:");
        int y2= sc.nextInt();
        count = (Math.pow((x2-x1),2) + (Math.pow((y2-y1),2)));
        distance  = Math.sqrt(count);
        System.out.println("distance" +distance);

    }
}
