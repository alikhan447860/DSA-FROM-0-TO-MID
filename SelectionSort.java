public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 1,2,1,0,1,2,0 };
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j <arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}