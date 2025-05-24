public class Program1 {
    public static void main(String[] args) {
        // Create a 4x3 matrix of double data type
        // 4 rows and 3 columns
        double[][] matrix = {
            {1.5, 2.7, 3.8},
            {4.2, 5.9, 6.3},
            {7.1, 8.4, 9.6},
            {10.5, 11.2, 12.7}
        };
        
        // Print the matrix in tabular format
        System.out.println("4x3 Matrix:");
        
        // Outer loop for rows
        for (int i = 0; i < 4; i++) {
            // Inner loop for columns
            for (int j = 0; j < 3; j++) {
                // Print each element with formatting for alignment
                System.out.printf("%6.2f ", matrix[i][j]);
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
