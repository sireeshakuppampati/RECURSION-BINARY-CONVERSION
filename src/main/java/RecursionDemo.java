public class RecursionDemo {
    public static int sumOfIntegers(int n) {
        if (n == 1) {
            return 1; // Base case
        }
        return n + sumOfIntegers(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        int number = 5; // Example input
        System.out.println("Sum of integers from 1 to " + number + " is: " + sumOfIntegers(number));
    }
}
