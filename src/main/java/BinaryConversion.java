public class BinaryConversion {
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return ""; // Base case
        }
        return decimalToBinary(decimal / 2) + (decimal % 2); // Recursive call
    }

    public static void main(String[] args) {
        int decimalNumber = 10; // Example input
        String binaryRepresentation = decimalToBinary(decimalNumber);
        if (binaryRepresentation.isEmpty()) {
            binaryRepresentation = "0";
        }
        System.out.println("Binary representation of " + decimalNumber + " is: " + binaryRepresentation);
    }
}
