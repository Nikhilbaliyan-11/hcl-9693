package ExceptionHandling;

public class CustomException extends Exception {

    public static void checkAge(int age) throws InvalidAgeException , ArrayIndexOutOfBoundsException { // throws
        if (age < 18) {

// throw
            throw new InvalidAgeException("Access denied - You must be at least 18 years old.");
        } else {

            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch ( InvalidAgeException e) {
            System.out.println("Caught manually thrown exception: " + e.getMessage());
        }
    }
}