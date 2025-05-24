public class FindMaxNumber {
    // main method
    public static void main(String[] args) {
        int x = 23;
        int y = 10;

        int maxNumber = findMax(x, y);

        System.out.println("maximum number is " + maxNumber);
    }

    // method to return maximun number between two integers
    public static int findMax(int num1, int num2) {
        int maximumNumber;

        if (num1 > num2) {
            maximumNumber = num1;
        } 
        else {
            maximumNumber = num2;
        }

        return maximumNumber;
    }
}
