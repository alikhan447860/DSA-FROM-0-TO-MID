public class FirstOcc {
    
        public static void main(String[] args) {
            int arr[] = {1, 2, 2, 2, 5, 6};
            int target = 2;
            int start = 0;
            int end = arr.length - 1;
            int result = -1;
    
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == target) {
                    result = mid; // Update result to current mid
                    start = mid + 1; // Move to the left side to find the first occurrence
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
    
            if (result == -1) {
                System.out.println("Element not found");
            } else {
                System.out.println("Element is found at index " + result);
                System.out.println("last occ is found at index " + result);
            }
        }
    }
    
