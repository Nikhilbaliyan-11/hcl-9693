package ExceptionHandling;

public class unchecked {
    public static void main(String[] args) {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught an Unchecked Exception: Null Pointer Encountered!");
        }

        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an Unchecked Exception: Index out of bounds!");
        }
    }
}