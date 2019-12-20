
/*#******************************************************************************************************************
        # @purpose :Demonstrate TwoDimensionalArray Logic.
        # @file  :TwoDimensionalArray.java
        # @author :Sandhya
   #***************************************************************************************************************/



package FunctionalProgram;
import java.util.*;
public class TwoDimensionalArray {
	public static void main(String[] args) {

int rows = 2;
int columns = 2;

int[][] array = new int[rows][columns];
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the elements of array");
	for(int i=0;i<2;i++) {
	for(int j=0;j<2;j++) {
	 array[i][j] = sc.nextInt();

	}}
	System.out.println("array:");
	System.out.println();
    	for(int i=0;i<2;i++ ) {
		for(int j=0;j<2;j++) {
	System.out.print(array[i][j] +" ");}
	System.out.println("");
		}
	}
	}
