public class rotateleftarr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6}; // Original array
        int k = 2; // Number of positions to rotate
        int n = arr.length;
        // Ensure rotation is within bounds
        k = k % n;
        int rotatearr[] = new int[n]; // Array to store rotated values
        int index = 0;
        // Copy elements from index k to the end
        for (int i = k; i < n; i++) {
            rotatearr[index++] = arr[i];
        }
        // Copy elements from the beginning to index k
        for (int i = 0; i < k; i++) {
            rotatearr[index++] = arr[i];
        }
        // Print the rotated array
        for (int val : rotatearr) {
            System.out.print(val + " ");
        }
    }
}
