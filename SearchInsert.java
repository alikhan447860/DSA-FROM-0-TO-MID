public class SearchInsert {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int x = 5;
        int start = 0;
        int end = arr.length - 1; // Correct initialization of end

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == x) {
                System.out.println("The target index is found at: " + mid);
                return; // Exit after finding the target
            }
            
            if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // If the target is not found, print the insertion position
        System.out.println("The target should be inserted at index: " + start);
    }
}
