public class ExtractNonDuplicates {
    public static void main(String[] args) {
        int arr[] = {12, 23, 34, 12, 45, 23, 56}; // Input array
        int n = arr.length;

        // Array to store non-duplicate elements
        int[] result = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if arr[i] is a duplicate
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j] && i != j) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add to result array
            if (!isDuplicate) {
                result[index++] = arr[i];
            }
        }

        // Print the array with non-duplicate elements
        System.out.print("Non-duplicate elements: ");
        for (int i = 0; i < index; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
