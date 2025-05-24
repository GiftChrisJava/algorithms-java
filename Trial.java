import java.util.Scanner;

public class Trial {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // PART 3: Find the maximum among 5 numbers
        System.out.println("\nPART 3: Find Maximum Number");
        int[] fiveNumbers = new int[5];  // Create an array to store 5 integers
        
        // Loop to get 5 numbers from the user 1 3 2 5 0
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            fiveNumbers[i] = input.nextInt();  // Read the number input
        }
        
        // Find the maximum number
        int maxNumber = fiveNumbers[0];  // Assume the first number is the maximum
        
        // Loop through the array to find the actual maximum
        for (int i = 1; i < fiveNumbers.length; i++) {
            // If the current number is greater than maxNumber, update maxNumber
            if (fiveNumbers[i] > maxNumber) {
                System.out.println("max number : " + maxNumber +  " number at index " + fiveNumbers[i]);
                maxNumber = fiveNumbers[i];

                System.out.println("max number : " + maxNumber);
            }
        }
        
        // Display the maximum number
        System.out.println("The maximum number is: " + maxNumber);
        
        // Close the scanner to prevent resource leak
        input.close();
    }
}