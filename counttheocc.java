public class counttheocc {
    public static void main(String[] args) {
        int arr[]={2, 2, 2, 3, 4, 5, 6};
        int tar=2;
        int start=0;
        int end=arr.length-1;
        int count=0;
        while(start<=end) {
            int mid=(start+end)/2;
             if(arr[mid]==tar){
              count++;
              int left = mid - 1;
                while (left >= 0 && arr[left] == tar) {
                    count++;
                    left--;
                }
                // Check for duplicates to the right
                int right = mid + 1;
                while (right < arr.length && arr[right] == tar) {
                    count++;
                    right++;
                }
                break; 
             }else if(arr[mid]<tar){
                start=mid+1;
             }else{
                end=mid-1;
             }
        }
        System.out.println("The total occuerence of a element is "+count);
    }
}
