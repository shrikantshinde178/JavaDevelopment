package Java_Labs;

import java.util.Scanner;
import java.math.*;

public class throwException {

    static class MyCalculator {

        long power(int n, int p) throws Exception {
            if (n < 0 || p < 0) {
                throw new Exception("n or p should not be negative.");
            } else if (n == 0 && p == 0) {
                throw new Exception("n and p should not be zero.");
            } else {
                return (long) Math.pow(n, p);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter n: ");
            int n = scanner.nextInt();
            System.out.println("Enter p: ");
            int p = scanner.nextInt();
            
            //creating object of my calculator class
            MyCalculator myCalculator = new MyCalculator();
            
            long result = myCalculator.power(n, p);
            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
