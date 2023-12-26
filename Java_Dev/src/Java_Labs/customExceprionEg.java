package Java_Labs;

import java.util.Scanner;

class InvalidStudentException extends Exception {
    public InvalidStudentException(String message) {
        super(message);
    }
}

public class customExceprionEg {

    static public void check(int age, int passout) throws InvalidStudentException {
        if (age < 18 || age > 25 || passout < 2022 || passout > 2024) {
            throw new InvalidStudentException("Category not match for enrollment");
        } else {
            System.out.println("You are eligible to enroll in the course");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter age:");
            int age = sc.nextInt();
            System.out.println("Enter passout year:");
            int passout = sc.nextInt();

            customExceprionEg.check(age, passout);

        } catch (InvalidStudentException e) {
            System.err.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
