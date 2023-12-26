//Question : Given two strings of lowercase English letters,  and , perform the following operations:
//Sum the lengths of  and .
//Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
//Capitalize the first letter in  and  and print them on a single line, separated by a space.

package Java_Labs;

	import java.io.*;
	import java.util.*;

	public class subString {

	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        
	        System.out.print("Enter first String : ");
	        String A=sc.next();
	        
	        System.out.print("Enter Second String : ");
	        String B=sc.next();
	       
	        
	        try {
	            System.out.println(A.length() + B.length());
	        if(A.compareTo(B) >0){
	            System.out.println("Yes");
	        }else{
	            System.out.println("No");
	        }
	        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
	        } catch(Exception e){
	            System.out.println("Error : "+ e);
	        }
	    }
	}



