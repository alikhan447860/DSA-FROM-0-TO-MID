public class PeakMountainarray {
    public static void main(String[] args) {
        int arr[]={3,4,5,1};
        int start=0;
        int end =arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println("peak element is at index "+start+" with the value "+arr[start]);
    }
}
