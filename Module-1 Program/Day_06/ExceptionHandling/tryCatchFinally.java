package ExceptionHandling;

public class tryCatchFinally {
    public static void main(String[] args) {
        try {
            int[] result = new int[2];
            for(int i = 0; i < result.length+2; i++){
                System.out.println(result[i]);
            }
            int re = 10 / 2;
            System.out.println("Result: " + re);
        } catch (ArithmeticException e) {
            System.out.println("Handling division by zero exception.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handling division by zero exception.");
        }
        finally {
            System.out.println("Finally block executed: Cleanup actions here.");
        }
    }
}