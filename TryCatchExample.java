public class TryCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int[] numbers = {1, 2, 3};
            System.out.println("The number at index 3 is: " + numbers[3]); // This will throw an exception
        } catch (ArrayIndexOutOfBoundsException q) {
            // Handling the exception
            System.out.println("Exception caught: " + q);
        } finally {
            // Code that will always run, regardless of an exception occurring or not
            System.out.println("The 'try catch' block is finished.");
        }
    }
}

