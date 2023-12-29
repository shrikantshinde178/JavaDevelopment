// 2. Write a Java program that takes an array of integers as input
//and sorts it in ascending order using any sorting algorithm of your choice.
//Print the sorted array.

package Java_Labs;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

	public class Array {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        // Asking for array size
	        System.out.print("Enter the array size: ");
	        int inputSize = scan.nextInt();

	        // Creating an array of the given size
	        int array[] = new int[inputSize];

	        // Taking input for each element in the array
	        for (int i = 0; i < array.length; i++) {
	            System.out.print("Enter the element at index " + i + ": ");
	            array[i] = scan.nextInt();
	        }

	        // Sorting the array in ascending order
	        Arrays.sort(array);

	        // Outputting the sorted array
	        System.out.println("Sorted Array in Ascending Order: " + Arrays.toString(array));
	    }
	}

}
