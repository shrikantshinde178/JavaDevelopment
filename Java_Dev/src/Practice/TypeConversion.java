// Write a program that takes user input and converts it to an integer using Integer.parseInt(). 
// Handle the NumberFormatException and NullPointerException that might occur during the conversion

import java.util.*;

public class TypeConversion{
    public static void main(String[] args){
        try
        {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something to change its datatype to Integer :");
        String input = scan.next();
        int i = Integer.parseInt(input);
        }
        catch(NumberFormatException e)
        {
            System.out.println("NumberFormatException : Error converting to Integer");
        }
        catch(NullPointerException e)
        {
             System.out.println("NullPointerException : Input is null");
        }
    }
}