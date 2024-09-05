public class Bubble {
    public static void main(String[] args) {
        int arr[] = {23, 322, 423, 2, 4, 32, 23};
        
        for (int i = 0; i < arr.length - 1; i++) { // Loop for passes
            for (int j = 0; j < arr.length - i - 1; j++) { // Inner loop for comparisons
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
