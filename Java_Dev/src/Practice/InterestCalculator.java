//Question
// Write a program to enter P,T (principal and time) and calculate simple interest. 
//Use the Scanner class for taking inputs from the console. Users will enter the principal amount and time(in years).
//Create an if-else statement and modify the interest rate based on the principal amount.
//If the amount > 10000 then the interest rate is 10%. 
//If the amount is between 10000 and 5000 then make the interest rate 8%. 
//For any amount below 5000 the interest rate should be 5%.

package Practice;

import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for principal amount and time
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        // Modify interest rate based on principal amount
        double interestRate;
        if (principal > 10000) {
            interestRate = 0.10; // 10%
        } else if (principal >= 5000) {
            interestRate = 0.08; // 8%
        } else {
            interestRate = 0.05; // 5%
        }

        // Calculate simple interest
        double simpleInterest = (principal * interestRate * time);

        System.out.println("\nPrincipal Amount: " + principal);
        System.out.println("Time (in years): " + time);
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
        System.out.println("Total Interest: " + simpleInterest);

        scanner.close();
    }
}


