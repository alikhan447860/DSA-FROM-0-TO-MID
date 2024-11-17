public class countgoodnumRecursion {
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 100;
        int goodCount = countGoodNum(lowerBound, upperBound, 0);
        System.out.println("Count of good numbers is: " + goodCount);
    }

    public static int countGoodNum(int current, int upperBound, int count) {
        if (current > upperBound) {
            return count; // Stop the recursion when current exceeds upperBound
        }

        if (isGoodNum(current)) {
            count++; // Increment count if current number is a good number
        }

        return countGoodNum(current + 1, upperBound, count); // Recurse with the next number
    }

    public static boolean isGoodNum(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) { // Check if any digit is odd
                return false; // Return false if a digit is odd
            }
            number = number / 10; // Remove the last digit
        }
        return true; // Return true if all digits are even
    }
}
