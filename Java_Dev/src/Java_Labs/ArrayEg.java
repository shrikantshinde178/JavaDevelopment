// Write a Java program that takes an array of integers as input from the user 
// and then calculates the sum and average of the elements in the array. 
// The program should output the sum and average.

package Java_Labs;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEg {

	    public static void main(String[] args){
	        Scanner scan = new Scanner(System.in);
	        //asking for array size
	        System.out.print("Enter the array size : ");
	        int inputSize = scan.nextInt();

	        int array[] = new int[inputSize];

	            //accepting an array elements
	             for(int i = 0; i < array.length; i++){
	                System.out.println("Enter the element at index " + i + ".");
	                array[i] = scan.nextInt() ;
	                }

	            //calculating sum    
	            int sum = 0;
	                for(int value : array){
	                    sum += value;
	                }

	            System.out.println("Sum : " + sum + "\nAverage : " + sum / inputSize);
	        
	    }
	    
}
